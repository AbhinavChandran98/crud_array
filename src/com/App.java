package com;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Service s=new Service();
		System.out.println("======Product Management System====");
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter database size...");
		int size=ip.nextInt();
		s.createDatabase(size);
		while(true) {
			System.out.println("=====Menu====");
			System.out.println("1.Add Product \n2.Find by id");
			System.out.println("3.Find By Company \n4.Update By Id");
			System.out.println("5.All Details \n6.Exit \nEnter the Option:-");
			int op=ip.nextInt();
			
			switch(op) {
			case 1:
					s.addProduct();
					break;
			case 2:
					s.findById();
					break;
				
			case 3:
					s.findByCompany();
					break;
				
			case 4:
					s.updateById();
					break;
				
			case 5:
					s.allDetails();
					break;
			
			case 6:
					System.exit(0);
					break;
				
			default:
					System.out.println("Invalid Option");
			}
			
		}
		
	}
}
