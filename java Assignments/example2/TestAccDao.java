package com.hsbc.jdbc.ex2;

public class TestAccDao {
	public static void main(String[] args) {
		AccDao dao=new AccDao();
		dao.showAccount(3);
		dao.checkBal(3);
		dao.withdraw(3, 200);
		dao.checkBal(3);
		dao.deposit(3, 200);
		dao.checkBal(3);
	}

}
