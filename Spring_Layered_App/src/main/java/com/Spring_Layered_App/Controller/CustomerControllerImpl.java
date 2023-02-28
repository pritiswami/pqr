package com.Spring_Layered_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Spring_Layered_App.Service.CustomerServiceImpl;
import com.Spring_Layered_App.dto.Customer;

@Controller
public class CustomerControllerImpl implements CustomerController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	public String saveCustDetails(Customer customer) {
			
			return customerServiceImpl.addCustInfo(customer);
	}
	

	public String deleteCustDetails(int customerID) {
		
		return customerServiceImpl.deleteCustInfo(customerID);
	}
}
