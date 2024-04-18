package com.Java.LoanApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Java.LoanApp.Model.AccAudit;
import com.Java.LoanApp.Service.AccAuditService;

@RestController
public class AccAuditController {

	@Autowired
	private AccAuditService accAudit;

	public AccAuditController(AccAuditService accAudit) 
	{
		super();
		this.accAudit = accAudit;
	}

	@PostMapping("/audit")
	public String saveAccount(@RequestBody AccAudit acc) 
	{
		accAudit.createAcc(acc);
		return "Save Data Successfully";
	}

	@DeleteMapping("/audit/{id}")
	public String delAcc(@PathVariable int id) {
		return accAudit.deleteAcc(id);

	}

	@GetMapping("/audit/{id}")
	public AccAudit getuser(@PathVariable int id) {

		return accAudit.getdetail(id);
	}

	@PutMapping("/audit/{id}")
	public AccAudit update(@PathVariable int id, @RequestBody AccAudit acc) {
		return accAudit.updateAcc(id, acc);

	}
}
