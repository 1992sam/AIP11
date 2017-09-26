package com.demo.sqlqueries;

public class AccountQueries {


		public static String insertAccount = "insert into user_accounts(firstName, lastName, address, age, email, password) values(?,?,?,?,?,?);";
		
		public static String deleteAccount = "delete from user_accounts where firstName = ? and lastName = ?;";
		
		public static String loginAccount= "Select * from user_accounts where email = ?;";
	
}
