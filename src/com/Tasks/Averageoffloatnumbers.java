package com.Tasks;

import java.util.Scanner;

public class Averageoffloatnumbers {

	public static void main(String[] args) {
		
		//Declaration of floating-point numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		float fnum=sc.nextFloat();
		System.out.println("Enter Second number");
		float snum=sc.nextFloat();
		System.out.println("Enter Third number");
		float tnum=sc.nextFloat();
		
		//Average of floating-point numbers
		float result=fnum+snum+tnum/3;
	 System.out.println("Average of three numbers :"+result);
	}
}
