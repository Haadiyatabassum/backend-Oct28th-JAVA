package com.Tasks;

import java.util.Scanner;

public class Sumoftwointegers {

	public static void main(String[] args) {
		
		//Declaration of two integers
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		int fnum=sc.nextInt();
		System.out.println("Enter Second number");
		int snum=sc.nextInt();
		
		//Sum of two integers
		int result=fnum+snum;
		System.out.println("sum of two numbers is :"+result);
	}
}
