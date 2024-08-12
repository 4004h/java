package ch03.sec08;

public class bitExample {
	public static void main(String[] args) {
		byte lede = (byte) 0b10101110;
		

//		byte chk_led = (byte) (1 << i);
		for (int i = 0; i < 8; i++) {
			byte chk_led = (byte) (1 << i);
			if( ( lede & chk_led) == chk_led ) {
				System.out.printf("%d램프가 켜짐\n", i);
			} else {
				System.out.printf("%d램프가 꺼짐\n", i);
			}
			
		}
		
	}
}
