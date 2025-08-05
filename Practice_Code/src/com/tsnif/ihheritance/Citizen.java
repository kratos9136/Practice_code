package com.tsnif.ihheritance;

public class Citizen {

	private String name;
	private String address;
	private long aadharNum;
	private long phNo;
	
	public Citizen() {
		this.name="Prime Minister";
		this.address="Delhi";
		this.aadharNum=1312754173;
		this.phNo=134347397;
	}

	public Citizen(String name, String address, long aadharNum, long phNo) {
		this.name = name;
		this.address = address;
		this.aadharNum = aadharNum;
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", aadharNum=" + aadharNum + ", phNo=" + phNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
}
