package ch05.sec05;

public class spliteEample {
	public static void main(String[] args) {
		String board = "1,자바학습,참조타입 string을 학습한다,홍길동";
		//번호, 제목, 내용, 성명 
		String [] tokens = board.split(",");
		String [] titles = {"번호","제목","내용","성명"};
		
		for (int i = 0; i < titles.length; i++) {
			System.out.printf("%s : %s\n", titles[i], tokens[i]);
		}
		
	}
}
