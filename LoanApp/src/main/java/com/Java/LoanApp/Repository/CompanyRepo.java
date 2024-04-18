package com.Java.LoanApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Java.LoanApp.Model.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
