package org.controller;

import java.util.Date;
import java.util.List;

import org.entity.Address;
import org.entity.Customer;
import org.service.AddressService;
import org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;



@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AddressService addressService;

	
	
	@RequestMapping(value="/addcustomer.do")
    public ModelAndView add(Customer customer){	
		
		System.out.println(customer.getAddressId());
		customer.setStoreId((byte) 2);
		customer.setCreateDate(new Date());
		System.out.println(customer);
		int insert = customerService.insertCustomer(customer);
		
		/*Gson gson = new Gson();
		String s = gson.toJson(itemsList);
		System.out.println(s);*/
	
		
        ModelAndView mav=new ModelAndView();
        
        
        if(insert==1){
        	mav.setViewName("success3");  
        }else{
        	mav.setViewName("error"); 
        }
        
        return mav;

    } 
	
	
	
	
	
	@RequestMapping(value="/findcustomer.do")
    public ModelAndView findAll(){	
		
		List<Customer> itemsList = customerService.findCustomers();
		
		int size=itemsList.size();
		
		
		
		List<Address> addressList = addressService.findAllAddress();
		
		
		System.out.println(size);
		
        ModelAndView mav=new ModelAndView();
        
        mav.addObject("itemsList", itemsList);
        mav.addObject("addressList", addressList);
        mav.addObject("size", size);
        
        if(size !=0){
        	mav.setViewName("success");  
        }else{
        	mav.setViewName("login"); 
        }
        
        return mav;

    }
}
