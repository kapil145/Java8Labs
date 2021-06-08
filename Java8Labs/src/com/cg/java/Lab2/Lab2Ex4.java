package com.cg.java.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex4 {
	
	public int[] modifyArray(int[] arr) {
//		int[] new_arr = new int[arr.length];
		int temp, count = 0;
		int[] arr2 = new int[arr.length];
		
		//sorting the array in ascending order
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
		
		//Fetching unique values
		for(int i = 0; i <=(arr.length - 1); i++) {
			if(arr[i] != arr[i+1]) {
				arr2[count] = arr[i];
				count++;
			}
		}
		
		
		System.out.println("Array with unique elements: " +Arrays.toString(arr2));
		
//		for (int i = 0; i < arr.length; i++) {     
//            for (int k = i+1; k < arr.length; k++) {     
//               if(new_arr[i] < new_arr[k]) {    
//                   temp = arr[i];    
//                   new_arr[i] = new_arr[k];    
//                   new_arr[k] = temp;    
//               }     
//            }     
//        }    
		
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
			
			Lab2Ex4 obj = new Lab2Ex4();
			int[] new_arr = obj.modifyArray(arr);
			System.out.println("Resulting array: " +Arrays.toString(new_arr));
	}
}
