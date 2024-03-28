package com.Java.LoanApp.Model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Audit")
public class AccAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "count_seq")
	@SequenceGenerator(name = "count_seq", sequenceName = "count_sequence", allocationSize = 1)
	private int Id;
	
	private int ComId;
	
	private String AccNo;

	private long Amount;

	private String Remarks;
	private Date date = new Date();
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getComId() {
		return ComId;
	}
	public void setComId(int comId) {
		ComId = comId;
	}
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public AccAudit(int id, int comId, String accNo, long amount, String remarks, Date date) {
		super();
		Id = id;
		ComId = comId;
		AccNo = accNo;
		Amount = amount;
		Remarks = remarks;
		this.date = date;
	}
	public AccAudit() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
