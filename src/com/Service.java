package com;

import java.util.Scanner;

public class Service {
	Product arr[];
	Scanner sc=new Scanner(System.in);
	int k=0;
	
	public void createDatabase(int size) {
		arr=new Product[size];
		System.out.println("Array Creation Succesfull");
	}
	
	public void addProduct() {
		
		System.out.println("============Add To Database===========");
		if(k==arr.length) {
			System.out.println("Database is full");
		}
		else {
			System.out.println("Enter the product id : ");
			int id=sc.nextInt();
			System.out.println("Enter product name : ");
			String pname=sc.next();
			System.out.println("Enter product price: ");
			double price=sc.nextDouble();
			System.out.println("Enter product company: ");
			String company=sc.next();
			System.out.println("Enter the quantity: ");
			int qt=sc.nextInt();
			Product p=new Product(id, pname, price, company, qt);
			arr[k]=p;
			k++;
			System.out.println("Product has been entered to database");
		}
		System.out.println("======================================");
	}
	
	public void findById() {
		System.out.println("=====================================");
		System.out.println("Enter the id:-");
		int c=0;
		int pid=sc.nextInt();
		for(Product ele:arr) {
			if(ele.getId()==pid)
			{
				System.out.println("Pid "+ele.getId());
				System.out.println("Pname "+ele.getPname());
				System.out.println("Price "+ele.getPrice());
				System.out.println("Company "+ele.getCompany());
				System.out.println("Quantity "+ele.getQt());
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("Id Not Found");
		}
	}
	
	public void findByCompany() {
		System.out.println("=======================");
		System.out.println("Enter company name : ");
		int c=0;
		String company=sc.next();
		for(Product ele:arr) {
			if(ele.getCompany().equals(company)) {
				System.out.println("Pid "+ele.getId());
				System.out.println("Pname "+ele.getPname());
				System.out.println("Price "+ele.getPrice());
				System.out.println("Company "+ele.getCompany());
				System.out.println("Quantity "+ele.getQt());
				c++;
			}
		}
		if(c==0) {
			System.out.println("Company not found");
		}
		System.out.println("===============================");
	}
	
	public void updateById() {
		System.out.println("================================");
		System.out.println("Enter the id: ");
		int id=sc.nextInt();
		int c=0;
		System.out.println("Enter the option to ");
		System.out.println("1.Price\n2.Quantity\n3.Product_Name\n4.Company");
		int opt=sc.nextInt();
		switch(opt) {
			case 1:
				System.out.println("Enter the price :");
				int price=sc.nextInt();
				for(Product ele:arr) {
					if(ele.getId()==id) {
						ele.setPrice(price);
						c++;
						break;
					}
				}
				break;
		
			case 2:
				System.out.println("Enter the Quantity :");
				int qt=sc.nextInt();
				for(Product ele:arr) {
					if(ele.getId()==id) {
						ele.setQt(qt);
						c++;
						break;
					}
				}
				break;
		
			case 3:
				System.out.println("Enter the Name :");
				String name=sc.next();
				for(Product ele:arr) {
					if(ele.getId()==id) {
						ele.setPname(name);
						c++;
						break;
					}
				}
				break;
		
			case 4:
				System.out.println("Enter the Company :");
				String company=sc.next();
				for(Product ele:arr) {
					if(ele.getId()==id) {
						ele.setCompany(company);;
						c++;
						break;
					}
				}
				break;
			default:
				c++;
				System.out.println("Invalid Option");
			}
		
		if(c==0) {
			System.out.println("Invalid Id");
		}
		System.out.println("==============================");
	}
	
	
	public void allDetails() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("=========================");
			System.out.println("Pid "+arr[i].getId());
			System.out.println("Pname "+arr[i].getPname());
			System.out.println("Price "+arr[i].getPrice());
			System.out.println("Company "+arr[i].getCompany());
			System.out.println("Quantity "+arr[i].getQt());
			System.out.println("=========================");
		}
	}
}
