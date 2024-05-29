package com.ntt.testcase;

import static org.junit.Assert.*;

import java.util.List;

import com.ntt.training.domain.admin;
import com.ntt.training.domain.vehicle;
import com.ntt.training.dao.AdminDao;
import com.ntt.training.dao.DAOAppException;

import com.ntt.training.dao.RegisterDAO;
import com.ntt.training.dao.VehicleDao;

import org.junit.Test;

public class AdminTest {
	private static AdminDao adminDao;
	
	 @Test
	    public void testValidateVehicle() throws DAOAppException {
	        
	        int uid = 1;
	        
	        // Perform the validation operation
	        List<admin> ad = AdminDao.validateAdmins(uid);
	        
	        // Assert that the list of vehicles is not null or empty
	        assertNotNull(ad);
	        assertFalse(ad.isEmpty());
	    }
}
