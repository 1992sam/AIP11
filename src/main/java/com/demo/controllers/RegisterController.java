package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Account;
import com.demo.service.AccountService;


@Controller
public class RegisterController {

	AccountService accountService;
	
	@RequestMapping(value="/createAccount")
	public String createAccount(@Valid @ModelAttribute ("aNewAccount") Account account, BindingResult result){
		System.out.println(result.toString());
		if(result.hasErrors()) {
			System.out.println("Form has Errors");
			return "createAccount"; 
		}
		else {
			accountService.createAccount(account);			
		}
		return "createAccount";
	}

// Spring setters

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
}
