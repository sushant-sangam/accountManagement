package com.cgi.account.transaction.application.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "ACCOUNT", schema="ACCOUNT_BANKING")
public class Account {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number")
	public Long accountNumber;

	@NotNull
	@Size(max = 50)
	@Column(name = "account_name")
	public String accountName;

	@NotNull
	@Size(max = 20)
	@Column(name = "account_type")
	public String accountType;

	@NotNull
	@Column(name = "balance_date")
	public Date balanceDate;

	@NotNull
	@Size(max = 3)
	@Column(name = "currency")
	public String currency;

	@NotNull
	@Column(name = "opening_available_balance")
	public Long openingAvailableBalance;

	public Account() {
		super();
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getOpeningAvailableBalance() {
		return openingAvailableBalance;
	}

	public void setOpeningAvailableBalance(Long openingAvailableBalance) {
		this.openingAvailableBalance = openingAvailableBalance;
	}

}
