package com.Java.LoanApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Java.LoanApp.Model.Company;
import com.Java.LoanApp.Service.OrganizeService;

@RestController
public class OrganizeController {
	
	@Autowired
	private OrganizeService org;

	public OrganizeController(OrganizeService org) {
		super();
		this.org = org;
	}

	@PostMapping("/company")
	public Company savedata(@RequestBody Company com) {
		Company cp = org.createUser(com);
		return cp;

	}

	@DeleteMapping("/company/{id}")
	public String delfarm(@PathVariable int id) {
		return org.deleteCompany(id);

	}

	@GetMapping("/company")
	public List<Company> getuser() {
		return org.getAllUsers();

	}

	@PutMapping("/company/{id}")
	public String update(@PathVariable int id, @RequestBody Company com) {
		return org.updateUser(com, id);

	}

}
