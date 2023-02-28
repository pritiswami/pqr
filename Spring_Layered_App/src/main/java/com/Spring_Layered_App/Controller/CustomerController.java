package com.Spring_Layered_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.Spring_Layered_App.Service.CustomerServiceImpl;
import com.Spring_Layered_App.dto.Customer;

public interface CustomerController {
	
	public String saveCustDetails(Customer customer) ;
	
	public String  deleteCustDetails(int id);

}
