package com.tnsif.encapsulation;

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
	   }
	}
