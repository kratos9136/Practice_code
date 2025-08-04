package com.tnsif.encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {
	   public EncapsulationDemo() {
	   }

	   public static void main(String[] args) {
	      Person p1 = new Person();
	      p1.setName("Geetha"); 
	      p1.setId(20);
	      System.out.println(p1);
	      Person p2 = new Person();
	      p2.setId(123);
	      p2.setName("Neha");
	      System.out.println(p2);
	      
	      Person p3=new Person();
	      p3.setId(102);
	      p3.setName("Shyam");
	      System.out.println(p3);
	      
	      Person p4=new Person("Seetha",103);
	      System.out.println(p4);
	      
	      Scanner sc=new Scanner (System.in);
	      System.out.println("Enter the id");
	      int id=sc.nextInt();
	      System.out.println("Enter the name");
	      String name=sc.next();
	      
	      Person p5=new Person(name,id);
	      System.out.println(p5);
	      
	      
	   }
	}
