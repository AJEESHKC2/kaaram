package com.MoneyManage.Main;

public class Kadam {
    @SuppressWarnings("unused")
	private String personName;
    private boolean Paid=false;
	public String getPersonName() {
		return personName;
	}
	private double totalKadam=0;
	@SuppressWarnings("unused")
	private BankAccount bankAccount;
	public double getTotalKadam() {
		return totalKadam;
	}
	public void setTotalKadam(double totalKadam) {
		this.totalKadam = totalKadam;
		
	}
	public void addKadam(double gaveKadam,BankAccount bankAccount) {
		this.totalKadam=totalKadam+gaveKadam;
		bankAccount.deductMoney(gaveKadam);
		System.out.println("gave "+ gaveKadam + " to "+ this.personName);
	}
	public void payKadam(double gotKadam,BankAccount bankAccount) throws Exception {
		
		if(gotKadam>totalKadam){
			System.out.println(this.personName + " trying to give " + gotKadam);
			throw new Exception("thats more than the kadam you owe me");
		}
		else {
		this.totalKadam=totalKadam-gotKadam;
		System.out.println(this.personName+" gave back "+ gotKadam );
		System.out.println("Now " + this.personName + " owes you " + this.getTotalKadam());
		
		if(totalKadam==0) {
			System.out.println(this.personName+" FULLY PAID YOU BACK ");
			   this.Paid=true;
		}
		bankAccount.addMoney(gotKadam);
		
	
		
		
		}
	}
	public Kadam(String name,double totalKadam, BankAccount bankAccount)  {
		super();
		this.personName=name;
		this.totalKadam = totalKadam;
		this.bankAccount = bankAccount;
		if(totalKadam>0) {
			System.out.println("giving "+ totalKadam + " to "+ this.personName);
			bankAccount.deductMoney(totalKadam);
			System.out.println("Now " + this.personName + " owes you " + this.getTotalKadam());
		}
		
	}
}
