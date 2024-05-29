package com.ntt.training.domain;

public class feedback {
	private int id;

	private int userid;
	private int vno;
	private String feedback;
	private int rating;
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getUserid() {
		return userid;
	}




	public void setUserid(int userid) {
		this.userid = userid;
	}




	public int getVno() {
		return vno;
	}




	public void setVno(int vno) {
		this.vno = vno;
	}




	public String getFeedback() {
		return feedback;
	}




	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}




	public int getRating() {
		return rating;
	}




	public void setRating(int rating) {
		this.rating = rating;
	}




	
	
	public feedback(int id, int userid, int vno, String feedback, int rating) {
		super();
		this.id = id;
		this.userid = userid;
		this.vno = vno;
		this.feedback = feedback;
		this.rating = rating;
	}
	public feedback(int id, int userid, int vno, String feedback, int rating,int userid1) {
		super();
		this.id = id;
		this.userid = userid;
		this.vno = vno;
		this.feedback = feedback;
		this.rating = rating;
		this.userid=userid1;
	}


	

	/*public feedback(int userid2, String rating2) {
		// TODO Auto-generated constructor stub
	}




	public feedback(int userid2, int rating2) {
		// TODO Auto-generated constructor stub
	}



*/
	public feedback(int userid2) {
		// TODO Auto-generated constructor stub
		this.userid=userid2;
	}
	public feedback()
	{
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("feedback [id=");
		builder.append(id);
		builder.append(", userid=");
		builder.append(userid);
		builder.append(", vno=");
		builder.append(vno);
		builder.append(", feedback=");
		builder.append(feedback);
		builder.append(", rating=");
		builder.append(rating);
		
		builder.append("]");
		return builder.toString();
	}

	

}
