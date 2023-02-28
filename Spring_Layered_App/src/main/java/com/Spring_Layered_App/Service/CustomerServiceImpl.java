package com.Spring_Layered_App.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring_Layered_App.DAO.CustomerDAOImpl;
import com.Spring_Layered_App.dto.Customer;

@Service ("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAOImpl customerDAOImpl;
	
	public String addCustInfo(Customer customer) {
		
		return customerDAOImpl.insertCustData(customer);
	}

	public String deleteCustInfo(int customerID) {
		
		return customerDAOImpl.deleteCustData(customerID);
	}
}
