package com.Java.LoanApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class AccHolder 
{   @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "count_seq")
    @SequenceGenerator(name = "count_seq", sequenceName = "count_sequence", allocationSize = 1)
	private int id;
	private String accno;
	private String name;
	private Long Balance;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBalance() {
		return Balance;
	}
	public void setBalance(Long balance) {
		Balance = balance;
	}
	
	public AccHolder(int id, String accno, String name, Long balance) {
		super();
		this.id = id;
		this.accno = accno;
		this.name = name;
		Balance = balance;
	}
	public AccHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
