package com.demo.daoimpl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.dao.AccountDao;

import com.demo.model.Account;
import com.demo.sqlqueries.AccountQueries;

public class AccountDaoImpl implements AccountDao {

	DataSource dataSource;
	public void loginAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	public void registerAccount(Account account) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource); 
		jdbcTemplate.update(AccountQueries.insertAccount, new Object[] {account.getFirstName(),
				account.getLastName(),
				account.getAddress(),
				account.getAge(),
				account.getEmail(),
				account.getPassword()});
		
	}

	public void deleteAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	
	//Spring setters
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
}
