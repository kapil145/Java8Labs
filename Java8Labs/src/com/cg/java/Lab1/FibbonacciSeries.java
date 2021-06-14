package com.cg.java.Lab1;

import java.util.Scanner;

public class FibbonacciSeries {
	
	public static void Fibonacci1(int a, int b, int c)
	{
//		System.out.println("This is a recursive function");
		if(a>0)
		{
			int n3 = b + c;
			b = c;
			c = n3;
			System.out.print(+n3+"\t");
			Fibonacci1(a-1, b, c);			
		}	
	}
	
	public static void Fibonacci2(int a)
	{
//		System.out.println("This is a non-recursive function");
		int n1 = 1;
		int n2 = 1;
		int count = 0;
		while(count < a)
		{
			int n3 = n1+ n2;
			System.out.print(+n3+"\t");
			n1 = n2;
			n2 = n3;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fibonacci Series");
		
		System.out.println("Please set a range of series: ");
		int range = sc.nextInt();
		
		if(range==0)
		{
			System.out.println("Fibonacci series: 0");
		}
		else if(range==1)
		{
			System.out.println("Fibonacci series: 1");
		}
		else
		{
			System.out.println("");
			System.out.println("Options:");
			System.out.println("1) Using Recusive Function");
			System.out.println("2) Using Non-Recusive Function");
			System.out.println("Please enter option number: ");
					
			int choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1: 
				 int n1 = 1;
				 int n2 = 1;
				 Fibonacci1(range, n1, n2);
				 break;
			 case 2:
				 
				 Fibonacci2(range);
				 break;
			 default:
				 System.out.println("Please give a Valid output.");
			}
		}
			
	}
}
