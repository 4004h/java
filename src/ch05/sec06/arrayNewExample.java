package ch05.sec06;

public class arrayNewExample {
	public static void main(String[] args) {
		int arr1[] = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr[%d]\n",arr1[i]);
		}
		
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr[%d]\n",arr1[i]);
		}
		
		String arr3[] = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr[%s]\n",arr3[i]);
		}
		
		arr3[0]="토껴";
		arr3[1]="가붕이";
		arr3[2]="고앵위";
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr[%s]\n",arr3[i]);
		}
		
		System.out.printf("arr3[] : %s\n", System.identityHashCode(arr3));
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d] : %s\n", i, System.identityHashCode(arr3[i]));
		}
	
		arr3[0] = "카멜레온";
		arr3[1] = "토껴";
		System.out.printf("arr3[] : %s\n", System.identityHashCode(arr3));
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d] : %s\n", i, System.identityHashCode(arr3[i]));
		}
		
	}
}
