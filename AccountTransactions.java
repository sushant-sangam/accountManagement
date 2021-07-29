package com.cgi.account.transaction.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ACCOUNT_TRANSACTIONS", schema="ACCOUNT_BANKING")
public class AccountTransactions {

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
	@Column(name = "value_date")
	public String valueDate;

	@NotNull
	@Size(max = 3)
	@Column(name = "currency")
	public String currency;

	@Column(name = "credit_amt")
	public Float creditAmt;

	@Column(name = "debit_amt")
	public Float debitAmt;

	@NotNull
	@Size(max = 10)
	@Column(name = "debit_credit")
	public String debitCredit;

	@Size(max = 100)
	@Column(name = "transaction_narrative")
	public String transactionNarrative;

	public AccountTransactions() {
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

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Float getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(Float creditAmt) {
		this.creditAmt = creditAmt;
	}

	public Float getDebitAmt() {
		return debitAmt;
	}

	public void setDebitAmt(Float debitAmt) {
		this.debitAmt = debitAmt;
	}

	public String getDebitCredit() {
		return debitCredit;
	}

	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}

}
