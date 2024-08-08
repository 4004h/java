package ch02.sec09;

public class stringExample {
	public static void main(String[] args) {
		int result = 10 + 2 + 8;
		System.out.println(result);
		
		String result2 = 10 + 2 + "8";
		System.out.println(result2);
		
		result2 = 10 + "2" + 8;
		System.out.println(result2);
		
		result2 = "10" + 2 + 8;
		System.out.println(result2);
		
		result2 = "10" + (2 + 8);
		System.out.println(result2);
		

	}
}
