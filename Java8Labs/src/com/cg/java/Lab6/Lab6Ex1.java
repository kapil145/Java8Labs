package com.cg.java.Lab6;

import java.util.*;

public class Lab6Ex1 {
	public static void main(String[] args) {
		HashMap hash = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of map: ");
		int size = sc.nextInt();
		for(int i = 0; i<size; i++) {
			System.out.println("Enter the value for key("+i+") : ");
			String val = sc.next();
			hash.put(i, val);
		}
		System.out.println("Map : " +hash);
	}
}
