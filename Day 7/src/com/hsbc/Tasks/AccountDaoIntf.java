package com.hsbc.Tasks;

//Author : Amisha
//Date : 24/09/2020
//Purpose : POJI

public interface AccountDaoIntf {
	
	public void retrieveAllAccounts();
	public void addAccount(Account account);
	public void deleteAccount(int accId) throws NoAccountException;

}
