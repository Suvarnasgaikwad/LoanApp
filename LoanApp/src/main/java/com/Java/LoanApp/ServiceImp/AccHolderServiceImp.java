package com.Java.LoanApp.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.LoanApp.Model.AccHolder;
import com.Java.LoanApp.Repository.AccHolderRepo;
import com.Java.LoanApp.Service.AccHolderService;

@Service
public class AccHolderServiceImp implements AccHolderService {
    @Autowired
	private AccHolderRepo acchold;

	public AccHolderServiceImp(AccHolderRepo acchold) {
		super();
		this.acchold = acchold;
	}

	@Override
	public AccHolder createAcc(AccHolder acc) {
		return acchold.save(acc);
	}

	@Override
	public AccHolder updateAcc(int id, AccHolder acc) {
		AccHolder oldAcc = acchold.findById(id).get();
		oldAcc.setAccno(acc.getAccno());
		oldAcc.setName(acc.getName());
		return acchold.save(oldAcc);
	}

	@Override
	public String deleteAcc(int id) {
		boolean value = acchold.existsById(id);

		if (value == false) {
			return "Given Id is not available";
		}
		acchold.deleteById(id);
		return "Delete data Successfully";

	}

	@Override
	public AccHolder getdetail(int id) {
		return acchold.findById(id).get();
	}

}
