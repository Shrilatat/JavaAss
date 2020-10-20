package com.assign.acc;

public class CurrentAccount extends Account {
	int bal , overDraftAmt;
	public CurrentAccount(int accId, String accName) {
		super(accId, accName);
		
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public int getOverDraftAmt() {
		return overDraftAmt;
	}

	public void setOverDraftAmt(int overDraftAmt) {
		this.overDraftAmt = overDraftAmt;
	}

	

	
}
