package com.arwizon.banking.model;


public class Customerr {
	private static int count;
	private String name;
	private int customerId;
	private String address;
	private String accType;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Customerr.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "Customerr [name=" + name + ", customerId=" + customerId + ", address=" + address + ", accType="
				+ accType + "]";
	}
	
	
	
}
