package com.demo.serviceimpl;

import com.demo.dao.AccountDao;
import com.demo.model.Account;
import com.demo.service.AccountService;

public class AccountServiceImpl implements AccountService{

	AccountDao accountDao;
	public void createAccount(Account account) {
		
		
	}
	
	//Spring setters
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

}
