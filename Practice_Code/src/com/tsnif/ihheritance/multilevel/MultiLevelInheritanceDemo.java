package com.tsnif.ihheritance.multilevel;

import java.util.Scanner;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		City c=new City("India", "Delhi" , "Karnataka","Kannada ","Banglore", 1234567F);
		System.out.println(c);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the city name");
		String cityname=sc.next();
		System.out.println("Enter the area");
		float area=sc.nextFloat();
		System.out.println("Enter the state name");
		String statename=sc.next();
		System.out.println("Enter the language");
		String language=sc.next();
		System.out.println("Enter the country name");
		String countryname=sc.next();
		System.out.println("Enter the capital");
		String capital=sc.next();
		
		City c1=new City(countryname, capital, statename, language, cityname, area);
		System.out.println(c1);
	}

}
