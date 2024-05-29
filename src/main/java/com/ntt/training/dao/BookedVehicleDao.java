

package com.ntt.training.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ntt.dbcon.ConnectionHolder;
import com.ntt.dbcon.DBConnectionException;
import com.ntt.dbfw.DBFWException;
import com.ntt.dbfw.DBHelper;
import com.ntt.dbfw.ParamMapper;
import com.ntt.training.domain.User;
import com.ntt.training.domain.bookedvehicle;
import com.ntt.training.domain.vehicle;

// EmployeeDao
// employee login
// register,
// deletion
// updation .. 

public class BookedVehicleDao {
	
	
	public int insertbookedVehicle(final bookedvehicle vh) throws DAOAppException {
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
				pStmt.setInt(1,vh.getId());
				pStmt.setInt(2,vh.getVno());
				pStmt.setString(3,vh.getVname());
				pStmt.setString(4,vh.getStatus());
				pStmt.setString(5,vh.getVtype());
				pStmt.setInt(6,vh.getPrice());
				
			}
		};
		
		 try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			res = DBHelper.executeUpdate(con,SqlMapper.ADD_BOOKVEHICLE, mapper);

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
			users = DBHelper.executeSelect(con, SqlMapper.VIEW_BOOKEDVEHICLE,
					paramMapper, SqlMapper.BOOKEDVEHICLE_MAPPER);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}
	
	public bookedvehicle viewbookedvehicle(int id) throws DAOAppException {
	    ConnectionHolder ch = null;
	    Connection con = null;
	    bookedvehicle vh = null;
	    try {
	        ch = ConnectionHolder.getInstance();
	        con = ch.getConnection();
	        ParamMapper paramMapper = new ParamMapper() {
	            @Override
	            public void mapParams(PreparedStatement pStmt) throws SQLException {
	                pStmt.setInt(1, id);
	            }
	        };
	        List<bookedvehicle> vehicles = DBHelper.executeSelect(con, SqlMapper.ADMIN_VIEW_BOOKEDVEHICLE, paramMapper, SqlMapper.BOOKEDVEHICLE_MAPPER);
	        if (!vehicles.isEmpty()) {
	            vh = vehicles.get(0);
	        }
	    } catch (DBConnectionException e) {
	        throw new DAOAppException("Unable to connect to database", e);
	    } catch (DBFWException e) {
	        throw new DAOAppException("Unable to fetch vehicle", e);
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
