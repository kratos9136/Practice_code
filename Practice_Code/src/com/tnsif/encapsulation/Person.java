package com.tnsif.encapsulation;

public class Person {
   private String name;
   private int id;

   public Person() {
	   this.id=101;
	   this.name="Ram";   
   }
   
   public Person (String name, int id) {
	   this.name = name;
	   this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String toString() {
      return "Person [name=" + this.name + ", id=" + this.id + "]";
   }
}
