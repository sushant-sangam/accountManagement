package com.cgi.account.transaction.application.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.account.transaction.application.entity.Account;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account, Long> {

	List<Account> findAll();

	Account findByAccountNumber(Long accountNumber);

}