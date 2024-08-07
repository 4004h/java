package ch02.sec01;

public class Variable {
	public static void main(String[] args) {
		int x = 0b11;
		int y = 0b101;
		System.out.println("X:"+x+", Y:"+y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("X:"+x+", Y:"+y);
		
	}
}
