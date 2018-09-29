package pl.coderslab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import lombok.Data;

@Data
public class UserRepository {

	private List<User> list;
	AtomicLong counter;

	public UserRepository() {
		this.list = new ArrayList<>();
		this.counter = new AtomicLong(1);
	}

	public void addUser(String username, String password) {
		User user = new User();
		user.setId(getCounter().getAndIncrement());
		user.setUserName(username);
		user.setPassword(password);
		list.add(user);

	}

	public List<User> getAllUsers() {

		return list;

	}

	public User getById(Long id) {

		return list.stream().filter(el -> el.getId().equals(id)).findFirst()
				.orElse(null);
	}

	public User update(User user) {
		boolean deleted = delete(user);
		if (deleted) {
			list.add(user);
		}
		return getById(user.getId());
	}

	public boolean delete(User user) {
		return list.removeIf(el -> el.getId().equals(user.getId()));
	}
}
