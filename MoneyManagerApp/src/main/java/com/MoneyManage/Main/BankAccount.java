package com.MoneyManage.Main;

public class BankAccount {
	
	private String accountName;
	private double balance;
	public BankAccount(String accountName, double balance) {
		
		this.accountName = accountName;
		this.balance = balance;
	   
	}
	

	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
    public void addMoney(double money)
    {this.balance =balance+money;
    System.out.println("Account Balance "+this.getBalance());}
    
    public void deductMoney(double money)
    {
    try{
    		if(money>balance) {
    		throw new Exception(" Thats need more than you have in your bank account ");
    	    }
    		else{
    		this.balance =balance-money;
    		}
    	}
    	catch(Exception e){e.getMessage();}
    System.out.println("Account Balance  "+this.getBalance());}
}
