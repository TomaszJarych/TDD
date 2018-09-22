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
		
		
	}

	
	public List<User> getAllUsers(){
		
		return null;
		
		
	}
	
	
	public User getById(Long id) {
		
		return null;
	}
}
