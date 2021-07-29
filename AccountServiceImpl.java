package com.cgi.account.transaction.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.account.transaction.application.entity.Account;
import com.cgi.account.transaction.application.entity.AccountTransactions;
import com.cgi.account.transaction.application.exception.AccountNotFoundException;
import com.cgi.account.transaction.application.exception.AccountTransactionsNotFoundException;
import com.cgi.account.transaction.application.repository.AccountRepository;
import com.cgi.account.transaction.application.repository.AccountTransactionsRepository;
import com.cgi.account.transaction.application.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	AccountTransactionsRepository accountTransactionsRepository;

	@Override
	public Account listAccount(Long id) {
		Account account = accountRepository.findByAccountNumber(id);

		if (account == null)
			throw new AccountNotFoundException("Account details cannot be found for account Number: " + id);

		return account;
	}

	@Override
	public List<AccountTransactions> listAccountTransactions(Long id) {
		List<AccountTransactions> acctTransactions = accountTransactionsRepository.findByAccountNumber(id);

		if (acctTransactions.size() == 0)
			throw new AccountTransactionsNotFoundException("Transactions not found for account number:" + id);

		return acctTransactions;
	}

}
