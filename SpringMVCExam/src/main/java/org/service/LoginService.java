package org.service;

import java.util.List;

import org.entity.Customer;

public interface LoginService {
	
	public List<Customer> findAnyCustomers(String firstName);
}
