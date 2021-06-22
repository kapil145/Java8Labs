package src.com.cg.java.Lab9;

import java.util.Scanner;

interface MyInterface{
	void power(double x, double y);
}
public class Lab9Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter power: ");
		double b = sc.nextDouble();
		
		MyInterface my = (double x, double y) -> {
			System.out.println(x+ " ^ " +y+ " = " +Math.pow(x, y));
		};
		my.power(a, b);
	}
}
