package org.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.entity.Customer;
import org.service.CustomerService;
import org.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
@Autowired
private LoginService loginService;

@RequestMapping(value="loginAction.do", method=RequestMethod.POST)  
 public ModelAndView loginAction(String firstName) {  
    

	
	
	ModelAndView mav=new ModelAndView();
   
   List<Customer> itemsList = loginService.findAnyCustomers(firstName);
   System.out.println(itemsList);
   if(itemsList.isEmpty()){
	   mav.setViewName("login"); 
   }else{
	   if(itemsList.get(0).getCustomerId() != 0) {  
		   mav.setViewName("success1");
		 
	   }
   } 
         
   return mav;  
} 
	



@RequestMapping(value="logout.do")  
public ModelAndView logout() {  
   

	
	
  ModelAndView mav=new ModelAndView();
  
  
  mav.setViewName("login"); 
  
  return mav;  
} 
}
