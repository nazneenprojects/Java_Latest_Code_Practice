import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList<String>();
		l1.add("No");
		l1.add("duty");
		l1.add("is");
		l1.add("more");
		l1.add("imp");
		l1.add("than");
		l1.add("giving");
		l1.add("thanks");
		l1.add("-unknown");

		System.out.println(l1);


		l1.remove("-unknown");

		System.out.println(l1);

		l1.addFirst("Quote:");

		System.out.println(l1);

		l1.set(8, "!");

		System.out.println(l1);

		//List to Array
		Object[] array1 =  l1.toArray();
		String[] array2 = Arrays.copyOf(array1,array1.length,String[].class);
		System.out.println("Array:"+ Arrays.toString(array2));
		
		
		//arrayList to LinkedList
		List<String> arrList = Arrays.asList("John", "Jacob", "Kevin", "Katie", "Nathan");
		List<String> myList = arrList.stream().collect(Collectors.toCollection(LinkedList::new));
		
		//LinkedList to ArrayList
		LinkedList<String> l = new LinkedList<String>();
	      l.add("Orange");
	      l.add("Apple");
	      l.add("Peach");
	      l.add("Guava");
	      l.add("Pear");
	      List<String> aList = new ArrayList<String>(l);
	      for (Object i : aList) {
	          System.out.println(i);
	       }
		
		
		
		
		




	}

}
