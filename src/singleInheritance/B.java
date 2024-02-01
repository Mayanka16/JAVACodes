package singleInheritance;

public class B extends A{

	void showB() {
		System.out.println("I am class B");
	}
	public static void main (String args[]) {
		A obj1 = new A();
		obj1.showA();
		B obj2 = new B();
		obj2.showA();
		obj2.showB();
		

	}


}

