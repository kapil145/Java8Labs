package src.com.cg.java.Lab9;

import java.util.Scanner;

interface Fact{
	int factorial(int n);
}
public class Lab9Ex5 {
	static int fact = 1;
	
	public static int factnum(int n) {
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		Fact f = Lab9Ex5::factnum;
		System.out.println("Facorial of " +num+ " is " +f.factorial(num));
	}
}
