package com.Tasks;

import java.util.Scanner;

public class Totalcost {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the item:");
		String item=sc.next();
		double price=700;
		int quantity=7;
		double totalcost=quantity*price;
		System.out.println("Total cost of the items:"+totalcost);
	}
}
