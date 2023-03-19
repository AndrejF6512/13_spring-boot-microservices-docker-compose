package com.foltan.bank.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foltan.bank.app.entity.Bank;

public interface BankRepository extends JpaRepository<Bank,Long>{

	public Bank findByBankName(String bankName);
	
}
