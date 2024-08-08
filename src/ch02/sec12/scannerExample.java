package ch02.sec12;
import java.util.Scanner;

public class scannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값입력 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값입력 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);

		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
		System.out.printf("%d * %d = %d\n",x,y,x*y);
		System.out.printf("%d / %d = %f\n",x,y,(double)x/y);
	}
}
