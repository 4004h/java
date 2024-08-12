package ch05.sec07;

public class multiExample {
	public static void main(String[] args) {
		int scoreArr1[] = {100,90,80};
		int scoreArr2[][] = {
				{100,90,80},
				{90,80,100},
				{80,90,100}
			};
		int scoreArr3[][][] = {
				{{100,90,80},{100,80,90},{80,90,100}},
				{{30,20,100},{100,20,30},{20,100,30}},
				{{100,95,80},{100,80,95},{80,95,100}}
			};
		
		System.out.println(scoreArr1[1]);
		System.out.println(scoreArr2[0][1]);
		System.out.println(scoreArr3[0][0][1]);
		
		
//		System.out.println(scoreArr1[1]);
		System.out.println(scoreArr2[1][1]);
		System.out.println(scoreArr3[0][1][1]);
		
//		System.out.println(scoreArr1[1]);
//		System.out.println(scoreArr2[1][1]);
		System.out.println(scoreArr3[2][0][0]);
		
		System.out.printf("차수\t국어\t영어\t수학 \n");
//		System.out.printf("1차\t%02d\t%02d\t%02d \n",scoreArr2[0][0],scoreArr2[0][1],scoreArr2[0][2]);
//		System.out.printf("2차\t%02d\t%02d\t%02d \n",scoreArr2[1][0],scoreArr2[1][1],scoreArr2[1][2]);
//		System.out.printf("3차\t%02d\t%02d\t%02d \n",scoreArr2[2][0],scoreArr2[2][1],scoreArr2[2][2]);
		for (int i = 0; i < scoreArr2.length; i++) {
			System.out.printf("%d차\t%02d\t%02d\t%02d \n",i+1,scoreArr2[i][0],scoreArr2[i][1],scoreArr2[i][2]);
		}
		String names[] = {"철수","영희","말자"};
		System.out.printf("이름\t1차\t2차\t3차 \n");
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s\t%02d\t%02d\t%02d \n",names[i],scoreArr3[i][0][0],scoreArr3[i][1][0],scoreArr3[i][2][0]);
		}//scoreArr3
	}
}
