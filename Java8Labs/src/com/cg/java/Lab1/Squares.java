package com.cg.java.Lab1;
import java.util.Scanner;

public class Squares {
	
	public int calculateDifference(int a)
	{
		int sum=0, sum1=0, diff=0;
		
		for(int i=0; i<=a;i++)
		{
			sum=sum+(i*i);
		}
		
		for(int i=0; i<=a;i++)
		{
			sum1 = sum1+i;
		}
		diff = sum- sum1;
		return diff;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		Squares obj = new Squares();
		int res = obj.calculateDifference(num);
		System.out.println("Difference:" +res);
	}
		
}
