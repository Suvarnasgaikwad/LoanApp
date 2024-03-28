package com.Java.LoanApp.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Java.LoanApp.Model.AccHolder;
import com.Java.LoanApp.Service.AccHolderService;

@RestController
public class AccHolderController 
{     
	private AccHolderService acc;

	public AccHolderController(AccHolderService acc) {
		super();
		this.acc = acc;
	}
	
	@PostMapping("/accholder")
	public AccHolder  saveAccount(@RequestBody AccHolder account)
	{
		return acc.createAcc(account);
	}
	@DeleteMapping("/accholder/{id}")
	public String delAcc(@PathVariable int id) {
		return acc.deleteAcc(id);

	}
	@GetMapping("getacc/{id}")
	public AccHolder getuser(@PathVariable int id) {
	
      return acc.getdetail(id);
	}
 
	@PutMapping("acchold/update/{id}")
	public AccHolder update(@PathVariable int id, @RequestBody AccHolder account) 
	{  
		return  acc.updateAcc(id, account);
		

	}
	
}
