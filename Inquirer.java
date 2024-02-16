package edu.ucalgary.oop;

public class Inquirer {
	private String firstName;
	private String lastName;
	private String info;
	private String servicesPhone;
	
	// Constructor
	public Inquirer(String firstName, String lastName, String information, String servicesPhone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.info = information;
		this.servicesPhone = servicesPhone;
	}
	
	// Getters
	public String getFirstName() { return firstName; } 
	public String getLastName() { return lastName; } 
	public String getInfo() { return info; } 
	public String getServicesPhone() { return servicesPhone; } 
	
}