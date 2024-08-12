package ch05.sec06;

public class lengthExample {
	public static void main(String[] args) {
		String ssn = "123456789";
		int len = ssn.length();
		System.out.println(len);
		String oldstr = "홍길동은 어려서 집을 나옴 그래서 어렵게 큼";
		System.out.println(oldstr);
		//문자열 변경
		String newstr = oldstr.replace("홍길동", "고길봉");
		System.out.println(newstr);
		//잘라내기 substring(시작) substring(시작,끝) 
		ssn = "880102-1234567";
		String bir = ssn.substring(2,6);
		System.out.println(bir);
		
		char sx = ssn.charAt(7);
		String date = (sx=='1'||sx=='2') ? "19" : "20";
		date += ssn.substring(0,2)+"-"+ssn.substring(2,4)+"-"+ssn.substring(4,6);

		System.out.println(date);
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String oject = subject.substring(location);
		System.out.println(oject);
		
		boolean bool = subject.contains("자바");
		System.out.println(bool);
		
		
		
		
		String date1 = "2024년08월12일 23:45:23";
		String date2 = "2024-08-12 pm 11:25:03";
		String date3 = "24/08/12 am 06:25:13";
		String dt = "20:59:60";

		calculatData(date1);
		calculatData(date2);
		calculatData(date3);
	}
	public static void calculatData(String data) {
		String dt = "20:59:60";
		String dates = data;
		int loca = dates.indexOf(":")-2;
		String hour = dates.substring(loca,loca+2);
		String minute = dates.substring(loca+3,loca+5);
		String second = dates.substring(loca+6,loca+8);
		
//		System.out.println(dates.substring(loca));
		
		int dtloca = dt.indexOf(":");
		String dthour = dt.substring(dtloca-2,dtloca);
		String dtminute = dt.substring(dtloca+1,dtloca+3);
		String dtsecond = dt.substring(dtloca+4,dtloca+6);

		if(dates.contains("am")) {
			int am = Integer.parseInt(hour);
			am += 12;
			hour = am+"";
			
		}
		int hours = Integer.parseInt(dthour) - Integer.parseInt(hour);
		int minutes = Integer.parseInt(dtminute) - Integer.parseInt(minute);
		int seconds = Integer.parseInt(dtsecond) - Integer.parseInt(second);
		
		
		if(hours > 0)
			System.out.printf("오후 9시 정각까지 %d시 %d분 %d초 남았습니다. (%s)\n", hours,minutes,seconds, dates.substring(loca));
		else 
			System.out.printf("오후 9시 정각이 지났습니다. (%s)\n",dates.substring(loca));
	}
}
