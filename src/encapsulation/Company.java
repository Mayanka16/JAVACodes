package encapsulation;

public class Company extends Employee{
	public static void main (String args[]) {
		Employee e= new Employee();
		e.setEmpId(101);
		System.out.println(e.getEmpId());
	}

}
