package com.cg.demo;

public class Customer 
{
	private int CustomerId;
	private String CustomerName;
	private int CustomerContact;
	private Address CustomerAddress;
	
	public Customer(int customerId, String customerName, int customerContact, Address customerAddress)
	{
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerContact = customerContact;
		CustomerAddress = customerAddress;
	}

	/*public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public void setCustomerContact(int customerContact) {
		CustomerContact = customerContact;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}*/
	public void displayCustomerInfo()
	{
		System.out.println("Customer id is "+CustomerId+" CustomerName is "
	+CustomerName+" CustomerContact is "+CustomerContact+" Customeraddress is "+CustomerAddress);
	}
	

}
