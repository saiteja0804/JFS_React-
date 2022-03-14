package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien
{
	private int id;
	private String name;
	@Autowired
	private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getId() {
		return id;
	}
	
	public Alien() {
		super();
		System.out.println("Constructor called");
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public void call()
{
	System.out.println("hello world");
	laptop.call();
}

}
