package com.cg.java.Lab1;

import java.util.Scanner;

public class Increasingnum {
	public void checkNumber(int a)
	{
		int b = a;
		boolean flag = false;
		while(a>0)
		{
			int currentdigit = a%10;
			a = a/10;
			if(currentdigit <= a%10)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
	           System.out.println(+b+" is not an increasing number.");
	    }
		else
		{
	           System.out.println(+b+" is an increasing number.");
	    }
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		Increasingnum obj = new Increasingnum();
		obj.checkNumber(num); 
	}
}
