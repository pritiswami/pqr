package com.Spring_Layered_App.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Spring_Layered_App.dto.Customer;

// Connect to JDBC Template

@Repository("customerDAOImpl")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private JdbcTemplate jt;
	
	public String insertCustData(Customer customer) {
		
		int RecordInserted =jt.update("insert into CustomerInfo values (?,?,?)", customer.getCustomerID(), customer.getCustomerName(),customer.getCustomerLocation());
		
		return RecordInserted > 0  ?  "Successfully Inserted" :"Info Insertion failed";
	}
	
	public String deleteCustData(int customerID) {
		
		int recordDeletedStatus = jt.update("delete from CustomerInfo where id = ?", customerID);
		
		return recordDeletedStatus > 0 ? "Successfully inserted":"Failed to delete Cust Info";
	}

}
