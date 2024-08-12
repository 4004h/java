package ch05.sec04;

public class numpointerExample {
	public static void main(String[] args) {
		int[] intArr = null;
		if(intArr != null) intArr[0] = 10;

		
		String str = "홍길동";
		System.out.println(str.length());
	}
}
