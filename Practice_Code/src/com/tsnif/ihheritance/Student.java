package com.tsnif.ihheritance;

public class Student extends Citizen{
	private int rollNum;
	private String collegeName;

	public Student() {
		
	}

	public Student(String name, String address, long aadharNum, long phNo,int rollNum,String collegeName) {
		super(name, address, aadharNum, phNo);
		this.rollNum=rollNum;
		this.collegeName=collegeName;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getAadharNum()=" + getAadharNum() + ", getPhNo()=" + getPhNo()
				+ ", getClass()=" + getClass() + "]";
	}
	
}