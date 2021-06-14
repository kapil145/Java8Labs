package com.cg.java.Lab1;

import java.util.Scanner;

public class Sumofcubes {
	
	public int findcube(int a)
	{
		int num1, sum=0;
		while(a>0)
		{
			num1= a%10;
			sum= sum+(num1*num1*num1);
			a= a/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		Sumofcubes obj = new Sumofcubes();
		int res = obj.findcube(num);
		System.out.println("Cube of digits of " +num+ " is " +res); 
	}
}
