package com.ntt.training.domain;

public class calculateprice {
private int vid;
private int price;
private int discountprice;
private int days;
public int getVid() {
	return vid;
}

public void setVid(int vid) {
	this.vid = vid;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getDiscountprice() {
	return discountprice;
}

public void setDiscountprice(int discountprice) {
	this.discountprice = discountprice;
}

public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
}



public calculateprice(int vid,int price, int discountprice, int days) {
	super();
	this.vid=vid;
	this.price = price;
	this.discountprice = discountprice;
	this.days = days;
}
public calculateprice()
{
	super();
}
public int calculateTotalPrice() {
    int total = (price - discountprice) * days;
    return total;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("calculateprice [vid=");
	builder.append(vid);
	builder.append(", price=");
	builder.append(price);
	builder.append(", discountprice=");
	builder.append(discountprice);
	builder.append(", days=");
	builder.append(days);
	
	builder.append("]");
	return builder.toString();
}

public void setTotalPrice(double totalPrice) {
	// TODO Auto-generated method stub
	
}


}
