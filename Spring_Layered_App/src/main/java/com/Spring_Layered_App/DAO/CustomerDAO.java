package com.Spring_Layered_App.DAO;

import com.Spring_Layered_App.dto.Customer;

public interface CustomerDAO {
	
	public String insertCustData(Customer customer);
	
	public String deleteCustData(int customerID);
	

}
