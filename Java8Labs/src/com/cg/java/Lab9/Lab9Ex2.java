package src.com.cg.java.Lab9;

import java.util.Scanner;

interface MyInterface1{
	void edit(String str);
}

public class Lab9Ex2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String obj = sc.next();
		StringBuffer sbr = new StringBuffer();
		
		MyInterface1 my = (String st) -> {
			for(int i = 0; i < obj.length(); i++) {
				char ch;
				ch = obj.charAt(i);
				sbr.append(ch);
				sbr.append(" ");
			}
		};
		my.edit(obj);
		System.out.println(sbr);
	}	
}
