package ch02.sec07;

public class promotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
	}
}
