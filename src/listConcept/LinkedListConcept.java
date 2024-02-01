package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
			LinkedList<String> ll = new LinkedList<String>();
			
			ll.add("Hi");
			ll.add("I");
			ll.add("am");
			ll.add("Mayanka");
			System.out.println("Linked List values are "+ll);
			System.out.println("--------------------------------");
			
			
			//addFirst
			ll.addFirst("Hello");
			System.out.println("Linked List values are "+ll);
			System.out.println("--------------------------------");
			
			
			
			//addLast
			ll.addLast("Sao");
			System.out.println("Linked List values are "+ll);
			System.out.println("--------------------------------");
			
			
			//get			
			System.out.println("zero index value : " +ll.get(0));
			System.out.println("--------------------------------");
			
			
			//set
			ll.set(0, "Hola");
			System.out.println("zero index Value changed from Hello to : "+ll.get(0));
			System.out.println("--------------------------------");
			
			
			//remove
			ll.removeFirst();
			System.out.println("Remove zeroth index value "+ll);
			System.out.println("--------------------------------");
			
			ll.removeLast();
			System.out.println("Remove Last index value "+ll);
			System.out.println("--------------------------------");
			
			
			//removeindex
			ll.remove(2);
			System.out.println("Remove second index value "+ll);
			System.out.println("--------------------------------");
			
			
//			how to print or iterate all the values of linkedlist
//			1. for loop
//			2. while loop
//			3. iterator
//			4. Advance for loop
			
			
			//for loop
			System.out.println("Using for loop");
			for (int i = 0; i <ll.size(); i ++)
			{
				System.out.println(ll.get(i));
			}
			System.out.println("--------------------------------");
			
			
			//advance for loop
			System.out.println("Using advance for loop");
			for (String str :ll) {
				System.out.println(str);
				
			}
			System.out.println("--------------------------------");
			
			
			//iterator
			
			System.out.println("Using Iterator");

		Iterator<String> ar = ll.iterator();
		while(ar.hasNext()) {
		System.out.println(ar.next());

		
		}
		System.out.println("--------------------------------");
		
		
		System.out.println("Using While");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			
		}
		System.out.println("--------------------------------");
		

			
			
			
	}
	

}
