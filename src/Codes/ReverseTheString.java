package Codes;

public class ReverseTheString {
	public static void main(String[] args) {
	

		String name = "mayanka";
		char a[] = name.toCharArray();
		for(int i= a.length-1; i>=0 ;i--) {
		
			char reverse = a[i];
			System.out.println(reverse);
		}
		
	

	}

}
