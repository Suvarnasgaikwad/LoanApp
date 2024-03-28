package com.Java.LoanApp.Service;

import com.Java.LoanApp.Model.AccAudit;

public interface AccAuditService 
{
	AccAudit createAcc(AccAudit acc);

	AccAudit updateAcc(int id, AccAudit acc);

	String deleteAcc(int id);

	AccAudit getdetail(int id);

}
