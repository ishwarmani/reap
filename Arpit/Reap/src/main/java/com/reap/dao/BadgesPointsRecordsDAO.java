package com.reap.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BadgesPointsRecordsDAO {
	@Id
	private String employeeId;
	private int goldBadges;
	private int silverBadges;
	private int bronzeBadges;
	private int points;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	

}
