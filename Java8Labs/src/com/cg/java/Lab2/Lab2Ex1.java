package src.com.cg.java.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex1 {
	
	public int getSecondSmallest(int[] arr)
	{
		int min  = Integer.MAX_VALUE;
		int sec_min  = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == min)
			{
				min = arr[i];
			}
			else if(arr[i] < min)
			{
				sec_min = min;
				min = arr[i];
			}
			else if(arr[i] < sec_min)
			{
				sec_min = arr[i];
			}
		}
		return sec_min;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Finding Second Smallest Element in an array"); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
//		System.out.println(arr.length);
		if(arr.length > 0)
		{
			for(int i = 0; i<arr.length; i++)
			{
				System.out.println("Please Enter an element:");
				int a = sc.nextInt();
				arr[i] = a;
			}
			System.out.println("Entered Array:"+Arrays.toString(arr)); 
//			for(int i = 0; i<size; i++)
//			{
//				System.out.println("["+arr[i]+"]");
//			}
		}
		Lab2Ex1 obj = new Lab2Ex1();
		int res = obj.getSecondSmallest(arr);
		System.out.println("Second Smallest element: "+res);
	}
}
