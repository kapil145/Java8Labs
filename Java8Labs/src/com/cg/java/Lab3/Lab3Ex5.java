package com.cg.java.Lab3;

import java.util.Scanner;

public class Lab3Ex5 {
	public static void main(String[] args) {
		System.out.println("Program to show to no. of characters, words and lines: ");
		System.out.println("Please give some input");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count1 = 0, count2 = 0;
		
		System.out.println("No. of Characters : " +input.length());
		
		//No. of words
		for(int i = 0; i < input.length()-1; i++) {
			if( (input.charAt(i) == ' ') && (input.charAt(i+1) != ' ')) {
				count1++;
			}
		}
		System.out.println("No. of Words : " +count1);
		System.out.println("No. of lines : " +count2);
	}
}
