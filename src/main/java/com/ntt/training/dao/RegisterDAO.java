package com.ntt.training.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

//import com.keane.dao.SQLMapper;
//import com.keane.dao.UserDAOException;
import com.ntt.dbcon.ConnectionHolder;
import com.ntt.dbcon.DBConnectionException;
import com.ntt.dbfw.DBFWException;
import com.ntt.dbfw.DBHelper;
import com.ntt.dbfw.ParamMapper;
import com.ntt.training.domain.User;

// EmployeeDao
// employee login
// register,
// deletion
// updation .. 

public class RegisterDAO {
	
	
	public static int registerUser(final User user) throws DAOAppException {
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
				pStmt.setInt(1,user.getUserid());
				pStmt.setString(2,user.getUsername());
				pStmt.setString(3,user.getPassword());
				pStmt.setString(4,user.getCity());
				pStmt.setString(5,user.getEmail());
				pStmt.setInt(6,user.getContactno());
				
			}
		};
		
		 try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			res = DBHelper.executeUpdate(con,SqlMapper.ADD_USER, mapper);

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
			users = DBHelper.executeSelect(con, SqlMapper.FETCH_USER,
					paramMapper, SqlMapper.MAP_USER);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);
//return users;
	}
	
	public static List getUsers() throws DBFWException, DAOAppException, DBConnectionException
	{
		List users=null;
		ConnectionHolder ch=null;
		Connection con=null;
		try {
			ch=ConnectionHolder.getInstance();
			con=ch.getConnection();
		
			
			users=DBHelper.executeSelect(con,SqlMapper.FETCH_USER,SqlMapper.MAP_USER);
		} catch (DBConnectionException e) {
			throw new DBConnectionException("Unable to connect to db"+e);
		}
		finally {
			try {
				if (con !=null)
					con.close();
			}catch (SQLException e) {
				}
		}
			return users;
	}

	public static List validateUsers(final int uid) throws DAOAppException {
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
			users = DBHelper.executeSelect(con, SqlMapper.FETCH_USER,
					paramMapper, SqlMapper.MAP_USER);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		//return (users != null && users.size() > 0);
return users;
	}
}
