package ch03.sec08;

public class bitlogExample {
	public static void main(String[] args) {
		int num1 = 1;
		int shift = 3;
		int result = num1 << shift;
		System.out.printf("%d << %d = %d\n",num1,shift,result);
		
		num1 = Integer.parseInt(Integer.toBinaryString(num1 & 0xFF));
		result = Integer.parseInt(Integer.toBinaryString(result & 0xFF));
		
		System.out.printf("0b%08d << %s = 0b%08d\n",num1,shift,result);
		
		
	}
}
