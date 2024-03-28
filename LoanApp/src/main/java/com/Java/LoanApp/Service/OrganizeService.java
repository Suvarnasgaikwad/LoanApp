package com.Java.LoanApp.Service;

import java.util.List;

import com.Java.LoanApp.Model.Company;

public interface OrganizeService {
	Company createUser(Company com);

	String  updateUser(Company com, int id);

	String  deleteCompany(int comId);

	List<Company> getAllUsers();
}
