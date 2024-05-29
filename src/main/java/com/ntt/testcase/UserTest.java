package com.ntt.testcase;

import static org.junit.Assert.*;



import org.junit.Test;

import java.util.List;
import java.util.Scanner;

import com.ntt.training.dao.DAOAppException;
//import com.keane.dao.UserDAO;
import com.ntt.training.dao.RegisterDAO;
import com.ntt.training.domain.User;
import com.ntt.training.domain.admin;
import com.ntt.training.domain.vehicle;

public class UserTest {

	int expectedresult=1;
	int outresult;
	
	@Test
	public void test()throws Exception {
		outresult=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("New user kindly register ____*****");
		System.out.println("Enter user id:");
		int uid=sc.nextInt();
		System.out.println("Enter User Name:");
		String name=sc.next();
		System.out.println("Enter password:");
		String password=sc.next();
		System.out.println("Enter City:");
		String city=sc.next();
		System.out.println("Enter email:");
		String email=sc.next();
	System.out.println("Enter Contact:");
	int contact=sc.nextInt();
	
		
		
		User u=new User(uid,name,password,city,email,contact);
		outresult =RegisterDAO.registerUser(u);
		
		
		if (outresult==1) {
			System.out.println("User inserted");
		}
		else {
			System.out.println("Insertion failed");
		}
		assertEquals(expectedresult,outresult);
	}
	@Test
    public void testValidateUser() throws DAOAppException {
        // Define a test user ID
        int uid = 1;
        
        // Perform the validation operation
        List<User> users = RegisterDAO.validateUsers(uid);
        
        // Assert that the list of vehicles is not null or empty
        assertNotNull(users);
        assertFalse(users.isEmpty());
    }
}
