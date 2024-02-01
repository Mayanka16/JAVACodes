package wrapperClass;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "100";
		System.out.println(a);
		System.out.println(a+100);
		int aint = Integer.parseInt(a);	
		System.out.println(aint+100);
		
		
		
		System.out.println("------------------------------------------");
		
		String b = "true";
		boolean b1 = Boolean.parseBoolean(b);
		System.out.println(b1);

		System.out.println("------------------------------------------");
		
		
		String d = "101.33";
		System.out.println(d);
		System.out.println(d+10);
		
		double d1 = Double.parseDouble(d);
		System.out.println(d1);
		System.out.println(d1+10);
		
		System.out.println("------------------------------------------");
	}

}
