package ch05.sec05;

public class charatExample {
	public static void main(String[] args) {
		String jumin = "011222-3051454";
		char sx = jumin.charAt(7);
		System.out.println(sx);

//		char[] juminArr = {'0','1','1','2','2','2','-','3','0','5','1','4','5','4'};

//		System.out.println(sx);
		
		String day = "2024";
		String yer = jumin.substring(0,2);
//		jumin.charAt(0)+jumin.charAt(1)+""

		if(sx == '3' || sx == '4') {
			yer = "20"+yer;
		} else {
			yer = "19"+yer;
		}
		
		int age = Integer.parseInt(day) - Integer.parseInt(yer);
		int yogm = 1000;
		String nai = "";
		
		if(age < 18) {
			yogm = 500;
			nai = "미성년";
		} else if(age > 60) {
			yogm = 0;
			nai = "경노우대";
		} else {
			yogm = 1000;
			nai = "일반인";
		}
		System.out.println(
		Integer.parseInt(yer)+"생 "+
		age+"살 "+nai+"요금 "+yogm+"원 입니다.");

		
//		String juminNum = "111222-1051454";
//		char szSex = juminNum.charAt(7);
//		int iYear = (szSex == '1' || szSex == '2')? 1900:2000;
//		String strYear = ""+juminNum.charAt(0)+juminNum.charAt(1);
//		iYear += Integer.parseInt(strYear);
//		String strDate = ""+juminNum.charAt(2)+juminNum.charAt(3)+juminNum.charAt(4)+juminNum.charAt(5);
//		int iDate = Integer.parseInt(strDate);			
//		
//		int today=20240812;	
//		
//		double age = (today - (iYear*10000)+iDate)/10000.0;
//		
//		if(age < 18) {
//			System.out.println("당신은 500원입니다. 나이: "+age);
//		} else  if(age > 600000) {
//			System.out.println("당신은 0원입니다. 나이: "+age);
//		} else {
//			System.out.println("당신은 1,000원입니다. 나이: "+age);
//		}
	} 
}
