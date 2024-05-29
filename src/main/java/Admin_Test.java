import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.ntt.dbcon.DBConnectionException;
import com.ntt.dbfw.DBFWException;
import com.ntt.training.dao.AdminDao;
import com.ntt.training.dao.DAOAppException;
import com.ntt.training.dao.DiscountDao;
import com.ntt.training.dao.VehicleDao;


public class Admin_Test {

    @Test
    public void testAdminLogin() throws DBFWException, DBConnectionException, DAOAppException {
        AdminDao adminDao = new AdminDao();
        List<Object> result = adminDao.validateAdmin(1);
        assertEquals(1, result.size());
        // Add additional assertions based on your expected result
    }

//    @Test
//    public void testApprove() throws DBFWException {
//        VehicleDao vehicleDao = new VehicleDao();
//        List<Object> result = vehicleDao.validateUser(1);
//        assertEquals(1, result);
//    }
//
//
//    @Test
//    public void testview() throws DBFWException {
//    	DiscountDao adminDao = new DiscountDao ();
//    	boolean result = DiscountDao.validateUser(1);
//        int result = adminDao.viewdiscount("did");
//        assertEquals(1, result);
//    }
}
