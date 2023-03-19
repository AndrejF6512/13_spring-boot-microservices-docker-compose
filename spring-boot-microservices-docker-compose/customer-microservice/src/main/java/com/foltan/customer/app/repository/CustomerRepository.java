package com.foltan.customer.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foltan.customer.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	public Customer findByCustomerName(String customerName);
	
}
