package com.reap.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeDAO {
	@GeneratedValue
	private int id;
	@Id
	private String employeeId;
	private String employeeName;
	private String email;
	private String userRole;
	private String serviceLine;
	@OneToOne
	private BadgesPointsRecordsDAO records;
	public BadgesPointsRecordsDAO getRecords() {
		return records;
	}
	public void setRecords(BadgesPointsRecordsDAO records) {
		this.records = records;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getServiceLine() {
		return serviceLine;
	}
	public void setServiceLine(String serviceLine) {
		this.serviceLine = serviceLine;
	}
	
	
	
	
}
