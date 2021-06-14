package com.cg.java.Lab1;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		System.out.println("Prime number upto "+num+" are:");
		for(int i=2; i<=num; i++)
		{
			int flag = 0; 
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag = 1;
				}
			}
			if(flag==0)
			{
				System.out.print(+i+"\t");
			}
			else
			{
				flag=0;
			}
		}
	}
}
