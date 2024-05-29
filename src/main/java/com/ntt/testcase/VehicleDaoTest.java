package com.ntt.testcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.VehicleDao;
import com.ntt.training.domain.bookedvehicle;
import com.ntt.training.domain.vehicle;

import static org.junit.Assert.*;

import java.util.List;

public class VehicleDaoTest {
    
    private static VehicleDao vehicleDao;
    
    @BeforeClass
    public static void setUp() {
        // Initialize any necessary resources before running the tests
        vehicleDao = new VehicleDao();
    }
    
    @AfterClass
    public static void tearDown() {
        // Clean up any resources after running the tests
        vehicleDao = null;
    }
    
    @Test
    public void testInsertVehicle() throws DAOAppException {
        // Create a vehicle object for testing
        vehicle vh = new vehicle();
        vh.setVno(6);
        vh.setVname("Car");
        vh.setVtype("Sedan");
        vh.setVprice(20000);
        
        // Perform the insert operation
        int result = vehicleDao.insertVehicle(vh);
        
        // Assert that the result is successful (greater than 0)
        assertTrue(result > 0);
    }
    
    @Test
    public void testValidateVehicle() throws DAOAppException {
        // Define a test user ID
        int uid = 1;
        
        // Perform the validation operation
        List<vehicle> vehicles = vehicleDao.validateVehicle(uid);
        
        // Assert that the list of vehicles is not null or empty
        assertNotNull(vehicles);
        assertFalse(vehicles.isEmpty());
    }
    
    @Test
    public void testViewVehicle() throws DAOAppException {
        // Define a test vehicle ID
        int id = 1;
        
        // Perform the view vehicle operation
        vehicle vh = vehicleDao.viewvehicle(id);
        
        // Assert that the vehicle object is not null
        assertNotNull(vh);
    }
    
    
}
