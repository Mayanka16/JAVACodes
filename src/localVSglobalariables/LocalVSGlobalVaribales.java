package localVSglobalariables;

public class LocalVSGlobalVaribales {

	String name = "Mayanka";   /*Global Variable or Class Variable */
	int age = 30;


	public static void main(String[] args) {
		
		int i = 10; // local variable for static method
		LocalVSGlobalVaribales obj = new LocalVSGlobalVaribales();
		System.out.println("Name = " +obj.name);
		System.out.println("Age = " +obj.age);
		obj.sum(); // calling method through obj
		
		
	}

	public void sum() {
		int  a= 10; // local variable for sum method
		int b = 20;
		int add = a+b;
		System.out.println("Total of a and b = " +add); // cannot access outside main method

		


	}
	

}