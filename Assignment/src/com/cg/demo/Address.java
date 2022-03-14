package com.cg.demo;

public class Address 
{
	private String Street;
	private String City;
	private String State;
	private String Country;
	private int Zip;
	

	public void CustomerAddress(String street, String city, String state, String country, int zip) 
	{
		Street = street;
		City = city;
		State = state;
		Country = country;
		Zip = zip;
	}
	
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ","
				+ " State=" + State + ", "
						+ "Country=" + Country + ", Zip="
				+ Zip + "]";
	}
}



