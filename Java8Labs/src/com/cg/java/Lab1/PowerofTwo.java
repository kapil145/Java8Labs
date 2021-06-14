package com.cg.java.Lab1;

import java.util.Scanner;

public class PowerofTwo {
	public boolean checkNumber(int num)
	{
			boolean result = false;
			while(num>0)
			{
				int rem = num%2;
				if(rem!=0)
				{
					break;
				}
				num = num/2;
				if(num==1)
				{
					result = true;
				}
			}
			return result;
			
	}

	public static void main(String[] args) {
		System.out.println("Checking Whether given number is power of two or not:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		PowerofTwo obj = new PowerofTwo();
		boolean res = obj.checkNumber(num);
		if(res == true)
		{
			System.out.println(+num+" is a power of 2");
		}
		else
		{
			{
				System.out.println(+num+" is not a power of 2");
			}
		}
		
	}
}
