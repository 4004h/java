package ch04.sec02;

import java.util.Scanner;

public class ifExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		switch (num/10) {
		//case 10:
		//case 9:
		case 10,9: {
			System.out.println("A학점");
			break;
		}
		case 8: {
			System.out.println("B학점");
			break;
		}
		case 7: {
			System.out.println("C학점");
			break;
		}
		case 6: {
			System.out.println("D학점");
			break;
		}
		case 5: {
			System.out.println("E학점");
			break;
		}
		default:
			System.out.println("F학점");
		}
		
//		if(num >= 90) {
//			System.out.println("A학점");
//		} else if(num >= 80) {
//			System.out.println("B학점");
//		} else if(num >= 70) {
//			System.out.println("C학점");
//		} else if(num >= 60) {
//			System.out.println("D학점");
//		} else if(num >= 50) {
//			System.out.println("E학점");
//		} else {
//			System.out.println("F학점");
//		}
		
	}
}
