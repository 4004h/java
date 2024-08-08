package ch02.sec08;

public class castingExample {
	public static void main(String[] args) {
		int intv =10;
		byte bytv = (byte)intv;
		System.out.println(intv+" => "+bytv);
		
		intv = 128;
		bytv = (byte)intv;
		System.out.println(intv+" => "+bytv);
		
		intv = 256;
		bytv = (byte)intv;
		System.out.println(intv+" => "+bytv);
	}
}
