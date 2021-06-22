package src.com.cg.java.Lab9;

interface Demo{
	void welcome();
}

public class Lab9Ex4 {
	
	public static void example() {  
        System.out.println("This is just an example");  
    }
	
	public static void main(String[] args) {
		 Demo obj = Lab9Ex4::example;
		 obj.welcome();
	}
}
