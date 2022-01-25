package com.junitbasics;

class InsufficientFundsException extends Exception {

	  private double balance;

	  public InsufficientFundsException() {
	  }
}

public class BankAccount {
   private int accountNum;
   private String accountHolder;
   private int balance;
   
public BankAccount() {
	super();
}

public BankAccount(int accountNum, String accountHolder, int balance) {
	super();
	this.accountNum = accountNum;
	this.accountHolder = accountHolder;
	this.balance = balance;
}

public int getAccountNum() {
	return accountNum;
}
public void setAccountNum(int accountNum) {
	this.accountNum = accountNum;
}
public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

public void withdraw(int amount) throws InsufficientFundsException {
    if(amount <= balance) {
        balance -= amount;
    }
    else {
        int newBalance = amount - balance;
        throw new InsufficientFundsException();
    }

}
}
