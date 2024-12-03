package com.Tasks;

import java.util.Scanner;

public class Arithmeticoperations {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		int fnum=sc.nextInt();
		System.out.println("Enter Second number");
		int snum=sc.nextInt();
		//calculation
		int addition=fnum+snum;
		System.out.println("Addition of two numbers :"+addition);
		int subtraction=fnum-snum;
		System.out.println("Subtarction of two numbers :"+subtraction);
		int multiplication=fnum*snum;
		System.out.println("Multiplication of two numbers :"+multiplication);
		int division=fnum/snum;
		System.out.println("Division of two numbers :"+division);
	}
}
