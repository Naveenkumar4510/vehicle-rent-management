
package com.ntt.training.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ntt.dbcon.ConnectionHolder;
import com.ntt.dbcon.DBConnectionException;
import com.ntt.dbfw.DBFWException;
import com.ntt.dbfw.DBHelper;
import com.ntt.dbfw.ParamMapper;
import com.ntt.training.domain.User;
import com.ntt.training.domain.booking;
import com.ntt.training.domain.feedback;
import com.ntt.training.domain.vehicle;

// EmployeeDao
// employee login
// register,
// deletion
// updation .. 

public class BookingDao {
	
	
	public int insertBooking(final booking bk) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		int res = -1;
		
		ParamMapper mapper = new ParamMapper() 
		{
			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException
			{
//				pStmt.setInt(1, user.getPortalID());
//				pStmt.setString(2, user.getName());
//				pStmt.setInt(3, user.getEmployeeId());
//				pStmt.setString(4, user.getTechnology());
//				pStmt.setString(5, user.getPassword());

				pStmt.setInt(1,bk.getBookingId());
				pStmt.setInt(2,bk.getUserId());
				pStmt.setInt(3,bk.getVehicleId());
				pStmt.setDate(4,Date.valueOf(bk.getBookingDate()));
				pStmt.setDate(5,Date.valueOf(bk.getReturnDate()));
				pStmt.setDouble(6,bk.getTotalPrice());
				
			}
		};
		
		 try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			res = DBHelper.executeUpdate(con,SqlMapper.ADD_BOOKING, mapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return res;
	}

	
	public boolean validateUser(final int uid) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		List users = null;

		ParamMapper paramMapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				pStmt.setInt(1, uid);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			users = DBHelper.executeSelect(con, SqlMapper.VIEW_BOOKING,
					paramMapper, SqlMapper.BOOKING_MAPPER);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}
	
	public booking viewbooking(int id) throws DAOAppException {
	    ConnectionHolder ch = null;
	    Connection con = null;
	    booking vh = null;
	    try {
	        ch = ConnectionHolder.getInstance();
	        con = ch.getConnection();
	        ParamMapper paramMapper = new ParamMapper() {
	            @Override
	            public void mapParams(PreparedStatement pStmt) throws SQLException {
	                pStmt.setInt(1, id);
	            }
	        };
	        List<booking> vehicles = DBHelper.executeSelect(con, SqlMapper.ADMIN_VIEW_BOOKING, paramMapper, SqlMapper.BOOKING_MAPPER);
	        if (!vehicles.isEmpty()) {
	            vh = vehicles.get(0);
	        }
	    } catch (DBConnectionException e) {
	        throw new DAOAppException("Unable to connect to database", e);
	    } catch (DBFWException e) {
	        throw new DAOAppException("Unable to fetch booking details", e);
	    } finally {
	        try {
	            if (con != null)
	                con.close();
	        } catch (SQLException e) {
	        }
	    }
	    return vh;
	}
	
}
