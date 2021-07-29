package com.cgi.account.transaction.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.account.transaction.application.entity.Account;
import com.cgi.account.transaction.application.entity.AccountTransactions;
import com.cgi.account.transaction.application.service.AccountService;

@RestController
@RequestMapping("account-services/account/api")
public class AccountTransactionController {

	@Autowired
	AccountService service;

	@GetMapping("/{id}")
	public Account listId(@PathVariable(value = "id") Long id) throws Exception {

		return service.listAccount(id);

	}

	@GetMapping("/listTransactions/{id}")
	public List<AccountTransactions> listTransactions(@PathVariable(value = "id") Long id) throws Exception {

		return service.listAccountTransactions(id);
	}

}
