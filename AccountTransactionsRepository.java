package com.cgi.account.transaction.application.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.account.transaction.application.entity.AccountTransactions;

@Repository
@Transactional
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, Long> {

	List<AccountTransactions> findByAccountNumber(Long accountNumber);

}