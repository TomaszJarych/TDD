package pl.coderslab;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UserRepositoryTest {

	private UserRepository repo;

	@Before
	public void setUp() {
		this.repo = new UserRepository();
	}

	@Test
	public void addUserShouldAddUserToDB() {

		// given
		String name = "TestUser1";
		String password = "TestPassword1";
		int expected = 1;

		// when

		repo.addUser(name, password);
		List<User> users = repo.getAllUsers();

		// then

		assertEquals(expected, users.size());
	}

	@Test
	public void getUsersShouldNotBeNull() {
		// when
		List<User> users = repo.getAllUsers();

		// then
		assertNotNull(users);
	}

	@Test
	public void givenUserInDbWhenGetByIdThanReturnsUser() {
		// given
		String name = "TestUser1";
		String password = "TestPassword1";
		Long id = 1L;

		User expected = new User(id, name, password);

		repo.addUser(name, password);
		// when
		User result = repo.getById(id);

		// then
		assertNotNull(result);
		assertEquals(expected.getId(), result.getId());
		assertEquals(expected.getUserName(), result.getUserName());
		assertEquals(expected.getPassword(), result.getPassword());
	}

	@Test
	public void givenUserInDbWhenGetByIdThanReturnsUserAndEditingShouldChangeItState() {

		// given
		String name = "TestUser1";
		String password = "TestPassword1";
		Long id = 1L;

		String updatedName = "UpdatedName1";
		String updatedPassword = "UpdatedTestPassword01";

		User expected = new User(id, updatedName, updatedPassword);

		repo.addUser(name, password);
		User userToUpdate = repo.getById(id);
		userToUpdate.setUserName(updatedName);
		userToUpdate.setPassword(updatedPassword);

		// when
		User updatedUser = repo.update(userToUpdate);

		// then

		assertNotNull(updatedUser);
		assertEquals(expected.getId(), updatedUser.getId());
		assertEquals(expected.getUserName(), updatedUser.getUserName());
		assertEquals(expected.getPassword(), updatedUser.getPassword());
	}

	@Test
	public void givenUserInDbWhenGetByIdThanReturnsUserAndDelteShouldDeleteItFromDB() {
		// given
		String name = "TestUser1";
		String password = "TestPassword1";
		Long id = 1L;
		
		repo.addUser(name, password);
		User user = repo.getById(1L);
		int expetedSize = 0;
		
		//when
		boolean result = repo.delete(user);
		List<User> usersList = repo.getAllUsers();
		
		//then
		assertTrue(result);
		assertEquals(expetedSize, usersList.size());

	}

}
