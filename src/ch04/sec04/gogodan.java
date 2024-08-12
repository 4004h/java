package ch04.sec04;

public class gogodan {
	public static void main(String[] args) {
		
		for (int i = 8; i < 81-9; i++) {
			System.out.printf("%d x %d = %d\n",
		    (i/8)+1,(i%8)+2,((i/8)+1) * ((i%8)+2));
		}
		
	}
}
