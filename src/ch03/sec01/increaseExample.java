package ch03.sec01;

public class increaseExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.printf("계산전 X:%d Y:%d\n",x,y);

		System.out.println(++x);
		System.out.println(y++);
		System.out.printf("계산후 X:%d Y:%d\n",x,y);
		
		x = y = 10;
		System.out.printf("계산전 X:%d Y:%d\n",x,y);
		
		System.out.println(--x);
		System.out.println(y--);
		System.out.printf("계산후 X:%d Y:%d\n",x,y);
	}		
}
