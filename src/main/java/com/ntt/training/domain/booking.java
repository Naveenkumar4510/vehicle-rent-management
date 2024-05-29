package com.ntt.training.domain;

import java.time.LocalDate;

public class booking {
	private int bookingId;
	private int userId;
    private int vehicleId;
    private  LocalDate bookingDate;
    private LocalDate returnDate;
    private double totalPrice;
	public booking(int bookingId, int userId, int vehicleId, LocalDate bookingDate, LocalDate returnDate,
			double totalPrice) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.vehicleId = vehicleId;
		this.bookingDate = bookingDate;
		this.returnDate = returnDate;
		this.totalPrice = totalPrice;
	}
	
    public booking(int bid) {
		// TODO Auto-generated constructor stub
	}

	
	
    public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
    
	public booking()
	{
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("booking [bookingId=");
		builder.append(bookingId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", vehicleId=");
		builder.append(vehicleId);
		builder.append(", bookingDate=");
		builder.append(bookingDate);
		builder.append(", returnDate=");
		builder.append(returnDate);
		builder.append(", totalPrice=");
		builder.append(totalPrice);
		builder.append("]");
		return builder.toString();
	}

}