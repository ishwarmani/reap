package com.reap.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BadgesRecievedDAO {
	@Id
	private String EmployeeId;
	private int goldBadges;
	private int silverBadges;
	private int bronzeBadges;
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public int getGoldBadges() {
		return goldBadges;
	}
	public void setGoldBadges(int goldBadges) {
		this.goldBadges = goldBadges;
	}
	public int getSilverBadges() {
		return silverBadges;
	}
	public void setSilverBadges(int silverBadges) {
		this.silverBadges = silverBadges;
	}
	public int getBronzeBadges() {
		return bronzeBadges;
	}
	public void setBronzeBadges(int bronzeBadges) {
		this.bronzeBadges = bronzeBadges;
	}
	

}
