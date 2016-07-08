package com.reap.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.reap.enums.Karma;

@Entity
public class RecognizeKarmaDAO {
	
	@Id
	private String receiverEmployeeId;
	private String senderEmployeeId;
	private String message;
	private Karma karma;
	private String star;
	public String getReceiverEmployeeId() {
		return receiverEmployeeId;
	}
	public void setReceiverEmployeeId(String receiverEmployeeId) {
		this.receiverEmployeeId = receiverEmployeeId;
	}
	public String getSenderEmployeeId() {
		return senderEmployeeId;
	}
	public void setSenderEmployeeId(String senderEmployeeId) {
		this.senderEmployeeId = senderEmployeeId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Karma getKarma() {
		return karma;
	}
	public void setKarma(Karma karma) {
		this.karma = karma;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	
	
}
