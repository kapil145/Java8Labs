package src.com.cg.java.Lab9;

import java.util.Scanner;

interface login{
	boolean check(String uname, String pass);
}
public class Lab9Ex3 {
	public static void main(String[] args) {
		String Username = "Himanshu";
		String Password = "12345"; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Username : ");
		String uname = sc.next();
		System.out.println("Enter Password : ");
		String pass = sc.next();
		
		login log = (String user, String pas) ->{
			if(Username.equals(user) && Password.equals(pas))
				return true;
			return false;
		};
		System.out.println(log.check(uname, pass));
	}
}
