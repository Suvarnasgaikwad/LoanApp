package com.Java.LoanApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Company 
{   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "count_seq")
	@SequenceGenerator(name = "count_seq", sequenceName = "count_sequence", allocationSize = 1)
	private int id;
	private String code;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company(int id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
