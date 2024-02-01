package staticAndNonStatic;

public class StaticAndNonStatic {

	String name = "Mayanka";
	static int age = 30;


	public static void main(String[] args) {

		//how to call static methods and variables

		//1. direct calling
		sum();
		//2. calling by classname
		StaticAndNonStatic.sum();

		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);

		StaticAndNonStatic obj = new StaticAndNonStatic();



		//3. Using object reference(but with warning)
		System.out.println(obj.age);


		//how to call non static methods and variables

		System.out.println(obj.name);
		obj.sendMail();


	}
	public static void sum() {
		int a = 10;
		int b = 20;
		int add = a+b;
		System.out.println(add);

	}

	public void sendMail() {
		System.out.println("Send mail");
	}

}
