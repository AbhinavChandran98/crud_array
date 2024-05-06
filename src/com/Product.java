package com;


public class Product {
	private int id;
	private String pname;
	private double price;
	private String company;
	private int qt;
	
	public Product() {
		
	}

	public Product(int id, String pname, double price, String company, int qt) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.company = company;
		this.qt = qt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}
	
	

}
