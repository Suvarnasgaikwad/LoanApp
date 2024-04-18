package com.Java.LoanApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Java.LoanApp.Model.AccAudit;

@Repository
public interface AccAuditRepo extends JpaRepository<AccAudit, Integer> {

}
