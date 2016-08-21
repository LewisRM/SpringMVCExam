package org.service.impl;

import java.util.List;

import org.entity.Address;
import org.mapper.AddressMapper;
import org.mapper.CustomerMapper;
import org.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressMapper addressMapper;
	
	public List<Address> findAllAddress() {
		// TODO Auto-generated method stub
		return addressMapper.findAllAddress();
	}

}
