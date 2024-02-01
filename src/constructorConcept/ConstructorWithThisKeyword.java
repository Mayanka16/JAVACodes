package constructorConcept;

public class ConstructorWithThisKeyword {

	// class/Global Variables
	String name;
	int age;
	int i;

	ConstructorWithThisKeyword() {
		System.out.println("Default Constructor");
	}

	ConstructorWithThisKeyword(int i) {
		
		System.out.println("Single Parameter Constructor");

	}

	ConstructorWithThisKeyword(int i, int j) {
		System.out.println("Double Parameter Constructor");
	}

	ConstructorWithThisKeyword(String name, int age) {
		this.name = name;  // global to local variable
		this.age = age;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Mayanka", 31);
		ConstructorWithThisKeyword obj1 = new ConstructorWithThisKeyword(12);

		System.out.println(obj.name);
		System.out.println(obj1.i); // 0 as this is not intialized in single paramenter constructor
	}

}
