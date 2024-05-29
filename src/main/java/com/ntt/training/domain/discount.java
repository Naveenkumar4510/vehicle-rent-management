package com.ntt.training.domain;

public class discount {
private int did;
private int price;
private float percent;
private String code;

public discount(int did, int price, float percent, String code) {
	super();
	this.did = did;
	this.price = price;
	this.percent = percent;
	this.code = code;
}

public discount(int id, String code2) {
	// TODO Auto-generated constructor stub
}

public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public float getPercent() {
	return percent;
}
public void setPercent(float percent) {
	this.percent = percent;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public discount()
{
	super();
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("discount [id=");
	builder.append(did);
	builder.append(", price=");
	builder.append(price);
	builder.append(", percent=");
	builder.append(percent);
	builder.append(", code=");
	builder.append(code);
	
	builder.append("]");
	return builder.toString();
}


}
