package com.Java.LoanApp.Controller;

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
	private AccAuditService accAudit;

	public AccAuditController(AccAuditService accAudit) {
		super();
		this.accAudit = accAudit;
	}

	@PostMapping("/audit")
	public String saveAccount(@RequestBody AccAudit acc) {
		 accAudit.createAcc(acc);
		 return "Save Data Successfully";
	}

	@DeleteMapping("/accaudit/{id}")
	public String delAcc(@PathVariable int id) {
		return 	accAudit.deleteAcc(id);
	

	}

	@GetMapping("getaudit/{id}")
	public AccAudit getuser(@PathVariable int id) {

		return accAudit.getdetail(id);
	}

	@PutMapping("accaudit/update/{id}")
	public AccAudit update(@PathVariable int id, @RequestBody AccAudit acc) {
		return accAudit.updateAcc(id, acc);

	}
}
