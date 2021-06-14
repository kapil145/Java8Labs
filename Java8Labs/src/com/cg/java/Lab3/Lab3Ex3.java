package com.cg.java.Lab3;

import java.util.Scanner;

public class Lab3Ex3 {
	public String alterString(String str)
    {
           StringBuffer sb = new StringBuffer(str);
           for(int i = 0; i < str.length(); i++)
           {
                  char c = sb.charAt(i);
                  if(!(c == 'A' || c =='a' || c=='E'||c=='e' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'))
                  {
                        sb.replace(i,i+1,String.valueOf((char)(c+1)));
                  }
           }
           return sb.toString();
    }
    public static void main(String[] ar)
    {
    		Lab3Ex3 obj = new Lab3Ex3();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a string");
           String str = sc.next();
           sc.close();
           System.out.println(obj.alterString(str));
    }
}
