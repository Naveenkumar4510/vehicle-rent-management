package com.ntt.training.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.time.LocalDate;

import com.ntt.dbfw.ResultMapper;
import com.ntt.training.domain.User;
import com.ntt.training.domain.admin;
import com.ntt.training.domain.bookedvehicle;
import com.ntt.training.domain.booking;
import com.ntt.training.domain.calculateprice;
import com.ntt.training.domain.discount;
import com.ntt.training.domain.feedback;
import com.ntt.training.domain.vehicle;

public class SqlMapper {

	// database : mydb
	// table Name : user_info 
	// fields :  portalid(int (6)), name (varchar), employeeid(int 6), technology (varchar), password (varchar)
	
	//user
	public static final String FETCH_USER = "select username,password,city,email,contactno from user where userid=?";
	public static final String ADD_USER = "insert into user values(?,?,?,?,?,?)";
	//public static final String DEL_USER="delete from user where userid=?";
	//public static final String UPD_USER="update user_info set name=?,employeeId=?,technology=?,password=? where portalid=?";	
	
	//admin
	public static final String ADMIN_LOGIN = "select * from admin where adminid=?";
	public static final String ADD_ADMIN = "insert into admin values (?,?,?)";
	public static final String ADMIN_VIEW_VEHICLE = "select * from vehicle where vno=?";
	public static final String ADMIN_VIEW_FEEDBACK = "select * from feedback where userid=?";
	public static final String ADMIN_VIEW_BOOKEDVEHICLE = "select * from bookedvehicle where vno=?";
	public static final String ADMIN_VIEW_DISCOUNT = "select * from discount where price=?";
	public static final String ADMIN_VIEW_BOOKING = "select * from booking where bookingId=?";
	
	
	
	//vehicle
	public static final String VIEW_VEHICLE = "select * from vehicle where vno=?";
	public static final String ADD_VEHICLE = "insert into vehicle values(?,?,?,?)";
	
	
	//
	public static final String VIEW_BOOKEDVEHICLE = "select * from bookedvehicle where vno=?";
	public static final String ADD_BOOKVEHICLE = "insert into bookedvehicle values(?,?,?,?,?,?)";
	
	//feedback
	public static final String VIEW_FEEDBACK = "select * from feedback where userid=?";
	public static final String ADD_FEEDBACK = "insert into feedback values(?,?,?,?,?)";
	
	
	
	//discount
	public static final String VIEW_DISCOUNT = "select * from discount where did=?";
	public static final String ADD_DISCOUNT = "insert into discount values(?,?,?,?)";
	
	//booking
	public static final String VIEW_BOOKING = "select * from  booking where bid=?";
	public static final String ADD_BOOKING = "insert into booking values(?,?,?,?,?,?)";
	
	//price
	
	public static final String VIEW_PRICE = "select * from  calculateprice where vid=?";
	public static final String ADD_PRICE = "insert into calculateprice values(?,?,?,?,)";
	//public static final String=Calculate_price="SELECT price - (price * discountPrice / 100) * days AS total_price
	//		FROM calculateprice
	//		WHERE vid = ?";

	
	
	public static final ResultMapper MAP_USER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			User user = new User();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			user.setPassword(rs.getString("password"));
			user.setContactno(rs.getInt("contactno"));
			return user;
			
		}
	};
	public static final ResultMapper ADMIN_MAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			admin admin = new admin();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			admin.setPassword(rs.getString("password"));
			admin.setAdminid(rs.getInt("adminid"));
			return admin;
			
		}
	};
	
	public static final ResultMapper VEHICLE_MAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			vehicle vh = new vehicle();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			vh.setVno(rs.getInt("vno"));
			vh.setVname(rs.getString("vname"));
			vh.setVtype(rs.getString("vtype"));
			vh.setVprice(rs.getInt("vprice"));
			
			return vh;
			
		}
	};
	
	public static final ResultMapper FEEDBACK_MAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			feedback fb = new feedback();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			fb.setId(rs.getInt("id"));
			fb.setUserid(rs.getInt("userid"));
			fb.setVno(rs.getInt("vno"));
			fb.setFeedback(rs.getString("feedback"));
			fb.setRating(rs.getInt("rating"));
			
			return fb;
			
		}
	};
	public static final ResultMapper DISCOUNT_MAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			discount d = new discount();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			d.setDid(rs.getInt("id"));
			d.setPrice(rs.getInt("price"));
			d.setPercent(rs.getInt("percent"));
			d.setCode(rs.getString("code"));
			//fb.setRating(rs.getInt("rating"));
			
			return d;
			
		}
	};
	
	public static final ResultMapper BOOKING_MAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			booking b = new booking();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			b.setBookingId(rs.getInt("bookingId"));
			b.setUserId(rs.getInt("userId"));
		b.setVehicleId(rs.getInt("vehicleId"));
			b.setBookingDate(rs.getDate("bookingDate").toLocalDate());
			b.setReturnDate(rs.getDate("returnDate").toLocalDate());
			b.setTotalPrice(rs.getDouble("totalPrice"));
			//fb.setRating(rs.getInt("rating"));
			//LocalDate startdate=(rs.getDate(4).toLocalDate());
			return b;
			
		}
	};
	public static final ResultMapper PRICE_MAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			calculateprice c = new calculateprice();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			c.setVid(rs.getInt("vid"));
			c.setPrice(rs.getInt("price"));
		c.setDiscountprice(rs.getInt("discountprice"));
			c.setDays(rs.getInt("days"));
			//b.setReturnDate(rs.getDate("returnDate").toLocalDate());
			//b.setTotalPrice(rs.getDouble("totalPrice"));
			//fb.setRating(rs.getInt("rating"));
			//LocalDate startdate=(rs.getDate(4).toLocalDate());
			return c;
			
		}
	};
	
	
	
	
	public static final ResultMapper BOOKEDVEHICLE_MAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			bookedvehicle bv = new bookedvehicle();
//			user.setPassword(rs.getString("password"));
//			user.setEmployeeId(rs.getInt("employeeId"));
			bv.setId(rs.getInt("id"));
			bv.setVno(rs.getInt("vno"));
			bv.setVname(rs.getString("vname"));
			bv.setStatus(rs.getString("status"));
			bv.setVtype(rs.getString("vtype"));
			bv.setPrice(rs.getInt("price"));
			
			//fb.setRating(rs.getInt("rating"));
			//LocalDate startdate=(rs.getDate(4).toLocalDate());
			return bv;
			
		}
	};
	
	
	
	/*
	 * pStmt.setInt(1, user.getPortalID());
				pStmt.setString(2, user.getName());
				pStmt.setInt(3, user.getEmployeeId());
				pStmt.setString(4, user.getTechnology());
				pStmt.setString(5, user.getPassword());
	 * 
	 */

	
	

}
/*
<Context docBase="FrontControllerApp" path="/FrontControllerApp" reloadable="true" source="org.eclipse.jst.jee.server:FrontControllerApp">
			<Resource name="jdbc/MyDB"
			auth="container"
			driverClassName="oracle.jdbc.driver.OracleDriver"
			url="jdbc:oracle:thin:@localhost:1521:XE"
			username="TRDB"
			password="TRDB"
			maxActive="20"
			maxIdle="10"
			maxWait="-1"
			/>
			</Context>
*/