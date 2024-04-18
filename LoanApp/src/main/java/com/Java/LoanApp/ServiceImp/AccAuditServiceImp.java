package com.Java.LoanApp.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.LoanApp.Model.AccAudit;
import com.Java.LoanApp.Repository.AccAuditRepo;
import com.Java.LoanApp.Service.AccAuditService;

@Service
public class AccAuditServiceImp implements AccAuditService {
    
	@Autowired
	private AccAuditRepo repo;

	public AccAuditServiceImp(AccAuditRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public AccAudit createAcc(AccAudit acc) {
		return repo.save(acc);
	}

	@Override
	public AccAudit updateAcc(int id, AccAudit acc) {
		AccAudit oldAcc = repo.findById(id).get();
		oldAcc.setAccNo(acc.getAccNo());
		oldAcc.setComId(acc.getComId());

		return repo.save(oldAcc);
	}

	@Override
	public String deleteAcc(int id) {
		boolean value = repo.existsById(id);

		if (value == false) {
			return "Given Id is not available";
		}
		repo.deleteById(id);
		return "Delete Data Successfully";

	}

	@Override
	public AccAudit getdetail(int id) {
		return repo.findById(id).get();

	}

}
