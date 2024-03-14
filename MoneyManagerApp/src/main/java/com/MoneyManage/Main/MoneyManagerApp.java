package com.MoneyManage.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoneyManagerApp {

	public static void main(String[] args)  {
		SpringApplication.run(MoneyManagerApp.class, args);
		
		BankAccount salaryAccount=new BankAccount("ICII Salary",100000);
		
		Kadam friendKadam= new Kadam("Dhas",100,salaryAccount);
		
//		try {
//			friendKadam.payKadam(30, salaryAccount);
//			
//			friendKadam.payKadam(80, salaryAccount);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//		try {
//			friendKadam.payKadam(70, salaryAccount);
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		finally {System.out.println("quit app");}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
