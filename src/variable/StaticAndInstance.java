package variable;

public class StaticAndInstance {
	int a = 10;
	static int b = 20;
	public static void main (String args[]) {
		StaticAndInstance obj = new StaticAndInstance();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.a = 1000;
		obj.b = 2000;
		StaticAndInstance obj2 = new StaticAndInstance();
		System.out.println(obj2.a);//10 In case of instance variable when object is create it will allocate new memory
		System.out.print(obj2.b);//2000 static variable will share with every object
		
	}
	

}
