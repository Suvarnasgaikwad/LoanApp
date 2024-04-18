package com.Java.LoanApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Java.LoanApp.Model.AccHolder;

@Repository
public interface AccHolderRepo extends JpaRepository<AccHolder, Integer> 
{

}
