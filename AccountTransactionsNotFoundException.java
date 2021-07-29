package com.cgi.account.transaction.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountTransactionsNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8370886570932066613L;

	public AccountTransactionsNotFoundException(String exception) {
		super(exception);
	}

}