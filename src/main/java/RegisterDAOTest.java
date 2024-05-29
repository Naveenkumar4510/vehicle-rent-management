import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.RegisterDAO;
import com.ntt.training.domain.User;

public class RegisterDAOTest {
	
	private RegisterDAO registerDAO;
	private User testUser;
	
	@Before
	public void setUp() {
		registerDAO = new RegisterDAO();
		testUser = new User();
		// Set up test user data
		testUser.setUserid(1);
		testUser.setUsername("testuser");
		testUser.setPassword("testpass");
		testUser.setCity("Test City");
		testUser.setEmail("testuser@example.com");
		testUser.setContactno(1234567890);
	}
	
	@After
	public void tearDown() {
		// Clean up any data created during the test
		// (e.g., delete test user from the database)
	}
	
	@Test
	public void testRegisterUser() {
		try {
			int result = registerDAO.registerUser(testUser);
			// Assuming a successful registration, the result should be greater than 0
			assertTrue(result > 0);
		} catch (DAOAppException e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test
	public void testValidateUser() {
		try {
			boolean userExists = registerDAO.validateUser(testUser.getUserid());
			assertTrue(userExists);
		} catch (DAOAppException e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

}
