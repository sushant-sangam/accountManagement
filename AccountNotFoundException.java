package com.cgi.account.transaction.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2926767389562623092L;

	public AccountNotFoundException(String exception) {
		super(exception);
	}

}