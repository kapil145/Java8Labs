package src.com.cg.java.Lab2;

import java.util.Scanner;

public class Lab2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		int arraySize = sc.nextInt();
		String[] inputArray = new String[arraySize];

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println("Please Enter String in the array at position " + (i + 1));
			inputArray[i] = sc.next();
			System.out.println(inputArray[i]);
		}
		sc.close();
		Lab2Ex2.sortStrings(inputArray, arraySize);
	}

	static void sortStrings(String[] inputArray, int arraySize) {
		String temp;
		for (int i = 0; i < arraySize; i++) {
			for (int j = i + 1; j < arraySize; j++) {
				if (inputArray[i].compareTo(inputArray[j]) > 0) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		for (int k = 0; k < arraySize / 2; k++) {
			System.out.print(inputArray[k].toUpperCase());
		}
		for (int k = arraySize / 2; k < arraySize; k++) {
			System.out.print(inputArray[k].toLowerCase());
		}
	}

}
