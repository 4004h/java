package ch02.sec12;

public class printfExample {
	public static void main(String[] args) {
		System.out.println("날짜\t품목\t단가\t수량\t금액");
		System.out.println("3/7\t카라멜마끼야토\t20000\t1\t20000");
		System.out.println("12/25\t라때\t1000\t2\t2000");
		System.out.println("4/8\t아이스아메리카\t2000\t3\t6000");
		
		
		System.out.printf("%-5s %-20s %-10s %-5s %-5s \n",
				"날짜","품목","단가","수량","금액");
		System.out.printf("%02d/%02d %-20s %10d %5s %5s \n", 
				3,7,"as",20000,"1","20000");
		System.out.printf("%02d/%02d %-20s %10d %5s %5s \n", 
				12,25, "asdf",1000,"2","20000");
		System.out.printf("%02d/%02d %-20s %10d %5s %5s \n", 
				4,8,"asd",2000,"3","6000");
	}
}
