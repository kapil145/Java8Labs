package com.cg.java.Lab3;

import java.util.Scanner;

public class Lab3Ex2 {
	public String getImage(String str)
    {
           StringBuffer sb1 = new StringBuffer(str);
           sb1.append('|');
           StringBuffer sb2 = new StringBuffer(str);
           sb2.reverse();
           sb1.append(sb2);
           return sb1.toString();
    }
    public static void main(String[] ar)
    {
           Lab3Ex2 p = new Lab3Ex2();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a String");
           String str = sc.next();
           sc.close();
           System.out.println(p.getImage(str));
    }
}
