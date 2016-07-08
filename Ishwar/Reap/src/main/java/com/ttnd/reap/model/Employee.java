package com.ttnd.reap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private String employeeID;
	private String name;
	private String Email;
	private UserRole userRole;
	private String serviceLine;
	private Byte[] image;
	
	@OneToOne
	private GivingKitty givingKitty;
	@OneToOne
	private RecievedKitty recievedKitty;
	
	public GivingKitty getGivingKitty() {
		return givingKitty;
	}

	public void setGivingKitty(GivingKitty givingKitty) {
		this.givingKitty = givingKitty;
	}

	public RecievedKitty getRecievedKitty() {
		return recievedKitty;
	}

	public void setRecievedKitty(RecievedKitty recievedKitty) {
		this.recievedKitty = recievedKitty;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getServiceLine() {
		return serviceLine;
	}

	public void setServiceLine(String serviceLine) {
		this.serviceLine = serviceLine;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

}
