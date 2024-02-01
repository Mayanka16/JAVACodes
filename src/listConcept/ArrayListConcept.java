package listConcept;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("Maya");
		System.out.println(ar);

		System.out.println("--------------------------------");




		Employee e1 = new Employee("mayanka", 30, "QA");
		Employee e2 = new Employee("maya",30,"QA1" );
		Employee e3 = new Employee("manika", 30, "QA2");
		ArrayList<Employee> e4 = new ArrayList<Employee>();
		e4.add(e1);
		e4.add(e2);
		e4.add(e3);

		Iterator<Employee> it  = e4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println("--------------------------------");

		//addall
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Hi");
		ar5.add("I");
		ar5.add("AM");


		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Mayanka");
		ar6.add("Sao");


		ar5.addAll(ar6);
		for (int i = 0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));		

		}
		System.out.println("--------------------------------");
		//removeall
		ar5.removeAll(ar6);
		for (int j = 0; j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}
		System.out.println("--------------------------------");
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Hi");
		ar7.add("I");
		ar7.add("AM");
		ar7.add("Sao");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Mayanka");
		ar8.add("Sao");
		//retainAll
		ar7.retainAll(ar8);
		for (int k = 0; k<ar7.size();k++) {
			System.out.println(ar7.get(k));	

		}
	}
}


