package listConcept;

public class Employee {

	String name;
	int age;
	String dept;
	
	//constructor
	Employee(String name ,int age ,String dept){
		//initialize global variables
		this.name = name; // global variable = local variable when both names are same
		this.age = age;
		this.dept = dept;
		
	}
}
