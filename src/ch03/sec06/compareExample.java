package ch03.sec06;

public class compareExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1==num2);
		System.out.println(result1);
		boolean result2 = (num1!=num2);
		System.out.println(result2);
		boolean result3 = (num1<=num2);
		System.out.println(result3);
		System.out.println();
		
		char char1 = 'A';
		char char2 = 'A';
		boolean result4 = (char1 <= char2);
		System.out.println(result4);
		System.out.println();
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3<=num4);
		System.out.println(result5);
		System.out.println();
		
		String str1 ="자바";
		String str2 ="자바";
		boolean result6 = str1.equals(str2);
		System.out.println(result6);
		boolean result7 = str1==str2;
		System.out.println(result6);
		System.out.println();

	}
}
