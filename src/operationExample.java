
public class operationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte v1 = 10;
		byte v2 = 10;
		byte result2 = (byte) (v1 + v2);
		int result3 = v1 + v2;
		System.out.println(result2);
		System.out.println(result3);
		
		byte v3 = 10;
		int v4 = 10;
		long v5 = 1000L;
		short result4 = (short) (v3 + v4 + v5);
		long result5 = v3 + v4 + v5;
		System.out.println(result4);
		System.out.println(result5);
		
		char v6 = 'A';
		char v7 = 1;
		char result6 = (char) (v6 + v7);
		int result7 = v6 + v7;
		System.out.println(result6);
		System.out.println(result7);
		
		int v8 = 10;
		result3 = v8/4;
		System.out.println(result3);
		
		int v9 = 10;
		double result8 = v9/4;
		System.out.println(result8);
		
		int v10 = 1;
		int v11 = 2;
		result8  = (double) v10 / v11;
		System.out.println(result8);
		
		
	}
}
