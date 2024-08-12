package ch03.sec07;

public class logicalExample {
	public static void main(String[] args) {
		int charcode = '8';
		if((65<=charcode) && (charcode<=90)) {
			System.out.printf("%c 대문자임\n",charcode);
		}
		else if((97<=charcode) && (charcode<=122)) {
			System.out.printf("%c 소문자임\n",charcode);
		}
		else if((48<=charcode) && (charcode<=57)) {
			System.out.printf("%c 숫자형임\n",charcode);
		}
		
		int num = 6;
		if(num%2 == 0 ) {
			System.out.printf("%d는 2의 배수임\n",num);
		}
		if(num%3 == 0 ) {
			System.out.printf("%d는 3의 배수임\n",num);
		}
		
		if(num%3 == 0 && num%2 == 0) {
			System.out.printf("%d는 2와 3의 배수임\n",num);
		}
		if(num%3 == 0 || num%2 == 0) {
			System.out.printf("%d는 2나 3의 배수임\n",num);
		}
	}
}
//ㅓ