package com.Spring_Layered_App.SpringClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring_Layered_App.Controller.CustomerControllerImpl;
import com.Spring_Layered_App.dto.Customer;

public class ApplnClient {
	
  public static void main(String[] args) {

  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
  
  //geting controller class in container
  CustomerControllerImpl CustController = applicationContext.getBean(CustomerControllerImpl.class);
  
  // Create an object of Customer Class
  
  Customer customer = new Customer(2525, "Infosys", "Pune");
  
  // pass these details to controller class
  
 String saveInfo = CustController.saveCustDetails(customer);
 
 System.out.println(saveInfo);
  
  }
}
