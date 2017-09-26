package com.demo.dao;

import com.demo.model.Account;

public interface AccountDao {

	public void loginAccount(Account account);
	public void registerAccount(Account account);
	public void deleteAccount(Account account);
	
}
