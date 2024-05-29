package com.ntt.training.domain;

public class vehicle {
	private int vno;
	private String vname;
	private String vtype;
	private int vprice;
	

	
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
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public int getVprice() {
		return vprice;
	}
	public void setVprice(int vprice) {
		this.vprice = vprice;
	}
	
	public vehicle(int vno, String vname, String vtype, int vprice) {
		super();
		this.vno = vno;
		this.vname = vname;
		this.vtype = vtype;
		this.vprice = vprice;
	}


	public vehicle(int vno2, String vname2) {
		// TODO Auto-generated constructor stub
		this.vno=vno2;
		this.vname=vname2;
	}
	public vehicle()
	{
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("vehicle [vno=");
		builder.append(vno);
		builder.append(", vname=");
		builder.append(vname);
		builder.append(", vtype=");
		builder.append(vtype);
		builder.append(", vprice=");
		builder.append(vprice);
		
		builder.append("]");
		return builder.toString();
	}

	
}
