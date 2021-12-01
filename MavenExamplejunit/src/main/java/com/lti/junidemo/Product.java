package com.lti.junidemo;

public class Product {
	private int prdId;
	private String prdName;
	private String brdName="LTI Infotech";
	public Product(int prdId, String prdName, String brdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.brdName = brdName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getBrdName() {
		return brdName;
	}
	public void setBrdName(String brdName) {
		this.brdName = brdName;
	}
	public Object getbrdName() {
		// TODO Auto-generated method stub
		return null;
	}

}