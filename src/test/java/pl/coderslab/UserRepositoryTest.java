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
		fail("Not yet implemented");
	}

	@Test
	public void getUsersShouldNotBeNull() {
		//when 
		List<User> users = repo.getAllUsers();
		
		//then
		assertNotNull(users);
	}
	
}
