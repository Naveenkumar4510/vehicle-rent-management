
package com.ntt.training.domain;

public class bookedvehicle {
	private int id;
	private int vno;
    private String vname;
    private String status;
    private String vtype;
    private int price;
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getVno() {
		return vno;
	}



	public void setVno(int vno) {
		this.vno = vno;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getVtype() {
		return vtype;
	}



	public void setVtype(String vtype) {
		this.vtype = vtype;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	public bookedvehicle(int id, int vno, String vname, String status, String vtype, int price) {
		super();
		this.id = id;
		this.vno = vno;
		this.vname = vname;
		this.status = status;
		this.vtype = vtype;
		this.price = price;
	}
	


public bookedvehicle()
{
	super();
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("bookedvehicle [id=");
	builder.append(id);
	builder.append(", vno=");
	builder.append(vno);
	builder.append(", vname=");
	builder.append(vname);
	builder.append(", status=");
	builder.append(status);
	builder.append(", vtype=");
	builder.append(vtype);
	builder.append(", price=");
	builder.append(price);
	
	builder.append("]");
	return builder.toString();
}


}
