package firstpackage;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
//		String
//		int double float  long Integer Double
//		boolean
		int a=2;
		System.out.println("Enter any value :");
		if(a<10) {
			System.out.println("Smaller than 10");
		}
		else {
			System.out.println("greater");
		}
		
		switch(a) {
		case 1: System.out.println("equal to 1");break;
		case 2: System.out.println("equal to 2");break;
		}
	}
}
