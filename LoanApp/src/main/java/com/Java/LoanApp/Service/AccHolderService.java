package com.Java.LoanApp.Service;

import com.Java.LoanApp.Model.AccHolder;

public interface AccHolderService 
{
    AccHolder createAcc( AccHolder acc);

    AccHolder updateAcc(int id,AccHolder acc);

    String  deleteAcc(int id);

	 AccHolder getdetail(int id);

}
