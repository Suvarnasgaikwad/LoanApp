package com.Java.LoanApp.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.LoanApp.Model.Company;
import com.Java.LoanApp.Repository.CompanyRepo;
import com.Java.LoanApp.Service.OrganizeService;

@Service
public class OrganizeServiceImp implements OrganizeService {
    
	@Autowired
	private CompanyRepo comrepo;

	public OrganizeServiceImp(CompanyRepo comrepo) {
		super();
		this.comrepo = comrepo;
	}

	@Override
	public Company createUser(Company com) {
		return comrepo.save(com);

	}

	@Override
	public String updateUser(Company com, int id) {
		boolean value = comrepo.existsById(id);

		if (value == false) {
			return "Given Id is not available";
		}
		Company existinguser = comrepo.findById(id).get();
		existinguser.setCode(com.getCode());
		existinguser.setName(com.getName());
		Company updateuser = comrepo.save(existinguser);
		return "Update data Successfully";
	}

	@Override
	public String deleteCompany(int comId) {

		boolean value = comrepo.existsById(comId);

		if (value == false) {
			return "Given Id is not available";
		}
		comrepo.deleteById(comId);
		return "Delete Data Successfully";
	}

	@Override
	public List<Company> getAllUsers() {
		return comrepo.findAll();

	}

}
