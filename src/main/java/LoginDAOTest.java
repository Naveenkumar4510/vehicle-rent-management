import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.LoginDAO;
import com.ntt.training.domain.User;

public class LoginDAOTest {

    @Test
    public void testValidateUser() {
        // Create an instance of LoginDAO
        LoginDAO loginDAO = new LoginDAO();

        // Prepare test data
        int userIdToValidate = 1;

        try {
            // Call the validateUser method
            List<User> userList = loginDAO.validateUser(userIdToValidate);

            // Assertions
            assertNotNull(userList);
            assertFalse(userList.isEmpty());

            // You can perform further assertions based on your expectations
            User user = userList.get(0);
            assertEquals(userIdToValidate, user.getUserid());
            // Add more assertions based on the user object properties

        } catch (DAOAppException e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
