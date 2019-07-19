package com.neuedu.chapter02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Map<Integer, Account> accounts = new HashMap<>();
		
		accounts.put(1, new Account(1,"tom",800000));
		accounts.put(2, new Account(2,"jack",666666));
		accounts.put(3, new Account(3,"jerry",88888));
		
		//get user input
		Scanner sc = new Scanner(System.in);
		int userid = sc.nextInt();
		
		Account account = accounts.get(userid);
		System.out.println(account.getBalance());

	}
}

class Account{
	
	private int id;
	private String name;
	private double balance;
	public Account(int id, String name, double balance)
	{
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
