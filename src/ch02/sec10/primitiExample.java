package ch02.sec10;

public class primitiExample {
	public static void main(String[] args) {
		int ival = Integer.parseInt("10");
		System.out.println(ival+1);
		
		double dval = Double.parseDouble("10.123");
		System.out.println(dval);
		
		boolean bval = Boolean.parseBoolean("tRue");
		System.out.println(bval);
		
		String sval = String.valueOf(10);
		System.out.println(sval+10);
		
		sval = String.valueOf(3.14);
		System.out.println(sval+10);
		
		sval = String.valueOf(true);
		System.out.println(sval+10);
	
	}
}
