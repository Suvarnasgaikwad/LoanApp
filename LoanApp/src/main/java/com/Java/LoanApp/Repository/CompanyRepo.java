package com.Java.LoanApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Java.LoanApp.Model.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
