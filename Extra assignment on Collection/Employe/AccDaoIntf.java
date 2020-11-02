package com.hsbc.AssignCollect;

public interface AccDaoIntf {
      
	public void addAcc(Account a);
	public void closeAcc(Account a);
	public void debitAcc(Account a , double amt);
	public void creditAcc(Account a , double amt);
	public void showBal(int accId);
}
