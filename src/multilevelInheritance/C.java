package multilevelInheritance;


public class C extends B{
	void showc() {
		System.out.println("I am class C");

	}
	public static void main (String args[]) {
		A obj1 = new A();
		obj1.showA();
		System.out.println("-----------------------");
		B obj2 = new B();
		obj2.showA();
		obj2.showB();
		System.out.println("-----------------------");
		C obj3 = new C();
		obj3.showA();
		obj3.showB();
		obj3.showc();


	}
}
