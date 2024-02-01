package abstraction;

public class Scooter extends Vehicle{
	void start() {
		System.out.println("Scooter startes with Kick");
	}
	public static void main (String[] args) {
	Scooter c = new Scooter();
	c.start();
	
	Car c1 = new Car();
	c1.start();
	

}
}