package com.cg.java.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
	public int[] getSorted(int[] arr) {
		int n = arr.length;
		int start = 0, end = n-1, temp;
		
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("");
		System.out.println("Reversed array: " +Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Please Enter array elements: ");
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Your entered array");
		System.out.println(Arrays.toString(arr)); //Printing array Elements
		
		Lab2Ex3 obj = new Lab2Ex3();
		int[] new_arr = obj.getSorted(arr);
		System.out.println("Sorted Array: " +Arrays.toString(new_arr));
	}
}
