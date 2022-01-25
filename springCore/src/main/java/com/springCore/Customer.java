package com.springCore;

public class Customer {
	int customerId;
	 String customerName;
	 int customerContact;
	 Address customerAddress;

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
}
	public void display()
   {
   	System.out.println("Customer Details - " + this.customerId + this.customerName + this.customerContact);
   }

}
