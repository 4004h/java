package ch05.sec06;

public class arrayExample {
	public static void main(String[] args) {
		int score[];
		score = new int[] {83,90,87,70};

		System.out.println(Sum(score));
		printItem(score);
	}
	public static int Sum(int score[]) {
		int sum1 = 0;
		for (int i = 0; i < score.length; i++) {
			sum1 += score[i];
		}
		return sum1;
	}
	
	public static void printItem(int score[]) {
		for (int i = 0; i < score.length; i++) {
			
			System.out.printf("점수%d : %d\n",i,score[i]);
		}
	}
}
