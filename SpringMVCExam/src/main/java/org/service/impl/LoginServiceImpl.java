package org.service.impl;

import java.util.List;

import org.entity.Customer;
import org.mapper.CustomerMapper;
import org.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private CustomerMapper customerMapper;
	
	public List<Customer> findAnyCustomers(String firstName) {
		// TODO Auto-generated method stub
		return customerMapper.findAnyCustomer(firstName);
	}

}
