package com.MoneyManage.Main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/splitapp")
public class ApiController {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	private Map<String,BankAccount> BankAccounts=new HashMap<>();
	private Map<String,Kadam> Kadams=new HashMap<>();
	
	@GetMapping("/createaccount")
     public String CreateAccount(@RequestParam("name") String name,@RequestParam("amount") double amount) {
		BankAccounts.put(name, new BankAccount(name,amount));
		
		String response=BankAccounts.get(name).getAccountName()+ " created with balance " + BankAccounts.get(name).getBalance();
		return response;
	
	
}
	@GetMapping("/givekadam")
	public String giveKadam(@RequestParam("personname") String pername,@RequestParam("amount") double amount,@RequestParam("account") String accname ) {
	
		BankAccount account=BankAccounts.get(accname);
		
	Kadams.put(pername,new Kadam(pername,amount,account));
	String response= "gave "+ amount + " to "+ Kadams.get(pername).getPersonName();
	return response;
//http://localhost:8081/splitapp//givekadam?personname=Akshay&amount=6875&account=axisbank
	}
	
	@GetMapping("/checkBalance/{accname}")
	public double CheckBalance(@PathVariable String accname) {

	double balance= BankAccounts.get(accname).getBalance();
	return balance;
//http://localhost:8081/splitapp//givekadam?personname=Akshay&amount=6875&account=axisbank
	}

	
}