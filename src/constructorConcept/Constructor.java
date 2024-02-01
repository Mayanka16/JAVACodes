package constructorConcept;

public class Constructor {

	Constructor() {
		System.out.println("Default Constructor");
	}

	Constructor(int i) {

		System.out.println("1 parameter : " + i);

	}

	Constructor(int i, String a) {
		System.out.println("Multiple Parameter : " + a + " and " + i);
	}

	public static void main(String[] args) {

		Constructor obj1 = new Constructor(); // this will be automatically created everytime
		Constructor obj2 = new Constructor(20);
		Constructor obj = new Constructor(10, "Mayanka");

	}

}
