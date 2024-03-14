package com.MoneyManage.Main;

public class SpendingMoney {
	private String spendName;
	private String spendType;
	private double spendedMoney;
	private BankAccount spendBankAccount;
	public String getSpendName() {
		return spendName;
	}
	public void setSpendName(String spendName) {
		this.spendName = spendName;
	}
	public BankAccount getSpendBankAccount() {
		return spendBankAccount;
	}
	public void setSpendBankAccount(BankAccount spendBankAccount) {
		this.spendBankAccount = spendBankAccount;
	}
	public String getSpendType() {
		return spendType;
	}
	public void setSpendType(String spendType) {
		this.spendType = spendType;
	}
	public Double getSpendedMoney() {
		return spendedMoney;
	}
	public void setSpendedMoney(Double spendedMoney) {
		this.spendedMoney = spendedMoney;
	}
	
	public void spendMoney(String spendName, String spendType, double money, BankAccount bankAccount) throws Exception {
		this.spendName=spendName;
		this.spendType=spendType;
		this.spendedMoney=money;
		this.spendBankAccount=bankAccount;
		
		bankAccount.deductMoney(money);
	}
	
	
	
	
	
	

}
