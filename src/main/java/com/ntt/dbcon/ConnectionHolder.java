package com.ntt.dbcon;

import javax.sql.DataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;




public class ConnectionHolder {

	private static ConnectionHolder connectionHolderInstance = null;
	private DataSource ds = null;
	
	private ConnectionHolder()
	{
		
	}
	
	private void initAppDatasource() throws DBConnectionException 
	{

		try {

			BasicDataSource bds = new BasicDataSource();
			Properties ps = new Properties();
			ps.load(new FileInputStream("C:\\Users\\Admin\\Desktop\\naveenvrm\\vehiclenaveen\\FCApp\\src\\main\\java\\com\\ntt\\dbcon\\minicase.properties")); 
			
			String uid = ps.getProperty("uid");
			String pwd = ps.getProperty("pwd");
			String URL = ps.getProperty("url");
			String driverclazz = ps.getProperty("driver");

			bds.setUrl(URL);
			bds.setDriverClassName(driverclazz);
			bds.setUsername(uid);
			bds.setPassword(pwd);

			this.ds = bds;

		} catch (FileNotFoundException e) {

			throw new DBConnectionException
			("Unable to get connection Data to the database"+ e);

		} catch (IOException e) {

			throw new DBConnectionException("Unable to get connection Data to the database", e);
		}
	}
	
	public static ConnectionHolder getInstance() throws DBConnectionException 
	{
		
		synchronized (ConnectionHolder.class) 
		{
			
			if (connectionHolderInstance == null)
			{
				connectionHolderInstance = new ConnectionHolder();
			
				connectionHolderInstance.initAppDatasource();
			}
		}
		return connectionHolderInstance;
	}
	
	public Connection getConnection() throws DBConnectionException
	{

		try 
		{

			return ds.getConnection();  
			
			
		} catch (SQLException e) {

			throw new DBConnectionException("Unable to obtain a connection", e);
		}
	}
	
	
	public void dispose() throws DBConnectionException
	{

		BasicDataSource bds = (BasicDataSource) ds;
		try {

			bds.close();
		} catch (SQLException e) {

			throw new DBConnectionException("Unable to close the connection", e);
		}
	}
}
