package com.Spring_Layered_App.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Spring_Layered_App.dto.Customer;

public interface CustomerService {
	
	
	public String addCustInfo(Customer customer);
	
	public String deleteCustInfo(int customerID);

}
