package com.Balance;

import java.util.Scanner;

class Account {
	public int balance;
	public int accountnumber;
	 void displaybalance()
	 {
		 System.out.println("Account No: " + accountnumber +"Balance : " +balance);
	 }
	 
	 synchronized void deposit(int amount) {
		 balance = balance + amount;
		 System.out.println(amount + "is deposited");
		 displaybalance();
	 }
	synchronized void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(amount  + "is withdrawn");
		displaybalance();
		
		
	}
	//end of account class
	class TransactionDeposit implements Runnable {
		int amount;
		Account  accountx;
		
		TransactionDeposit( 	Account x, int amount){
			accountx=x;
			this.amount=amount;
			new Thread(this).start();
		}
		public void  run() {
			accountx.deposit(amount);
		}
	}
	class TrasactionWithdraw implements Runnable {
		int amount;
		Account  accountY;
		TrasactionWithdraw(	Account  y, int amount) {
			accountY=y;
			this.amount=amount;
			new Thread(this).start();
		}
		public void run() {
			accountY.withdraw(amount);
		}
	}
	public class BankSync {

	public  void main(String[] args) {
      
	Account ABC = new  Account();
	ABC.balance = 1000;
	ABC.accountnumber=150;
	Scanner scanner = new Scanner(System.in);
	int damount=300;
	
	TransactionDeposit t1;
	//TrasactionWithdraw t2;
	t1=new TransactionDeposit(ABC, 400);
	//t2=new TrasactionWithdraw(ABC,700);

	
	}

}
	
	}

