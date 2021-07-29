package com.cgi.account.transaction.application.service;

import java.util.List;

import com.cgi.account.transaction.application.entity.Account;
import com.cgi.account.transaction.application.entity.AccountTransactions;

public interface AccountService {
	
	
	public Account listAccount(Long id);
	
	
	public List<AccountTransactions> listAccountTransactions(Long id);

}
