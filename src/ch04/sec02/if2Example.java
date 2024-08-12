package ch04.sec02;

import java.util.Scanner;

public class if2Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		int num = (int)(Math.random()*10)*1000;
		System.out.printf("%s님 %d원냄",name,num);

		
	}
}
