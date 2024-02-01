package inheritance;

public class Dog extends Animal{
	public static void main (String args[]) {
	Dog d = new Dog();
	Animal a = new Animal(); // not possible in child class
	Animal a1 = new Dog();
	a1.eat();
	d.eat();
	
	

	

}
}
