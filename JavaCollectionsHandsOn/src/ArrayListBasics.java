import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		//after JDK 1.7
		ArrayList<String> list3 = new ArrayList<>();


		//add Element
		list1.add("Nazneen");
		list1.add(1, "Mulani");

		for(String a: list1)
		{
			System.out.print(a + " ");

		}

		//size
		System.out.println(list1.size());

		list1.trimToSize();

		System.out.println(list1.size());


		//index find
		int i = list1.indexOf("Mulani");
		System.out.println("index is "+i);

		int j = list1.indexOf("NAZNEEN");
		System.out.println("index is "+j);

		//traverse
		for(int k =0; k<list1.size(); k++)
		{
			System.out.println(list1.get(k));
		}

		for(String s : list1)
		{
			System.out.println(s);
		}

		//Searching
		String find1 = "Nazneen";
		System.out.println(list1.contains(find1));
		String find = "NazneeN";
		System.out.println(Collections.binarySearch(list1, find));


		//check empty list
		System.out.println(list1.isEmpty());
		System.out.println(list2.isEmpty());
		// if(list1.size() ==0) SOP(Empty");
		boolean s = list1.isEmpty();
		String m =s? (String) "empty" : (String) "nonEmpty";
		System.out.println(m);

		//Remove Element
		list1.remove(1);
		// or list1.remove("Mulani");
		for(String x : list1)
		{
			System.out.println(x);
		}

		//copy all items to another List

		list1.add("Mulani");
		list1.add("India");
		list2.add("Hey!");
		list2.addAll(1, list1);
		//list2.addAll(list1);
		for(String x : list2)
		{
			System.out.println(x);
		}

		//set & clear
		list2.set(0, "HowAreYou?");
		System.out.println(list2.get(0));

		list2.clear();

		//ArrayList to Array
		String[] arr = new String[list1.size()];
		arr = list1.toArray(arr);
		for(int x =0; x<arr.length; x++)
		{
			System.out.print(arr[x] + "-");
		}


		//Synchronized ArrayList 
		//List list = Collections.synchronizedList(new ArrayList(...));

		//Array -> ArrayList
		String[] geeks = {"Rahul", "Utkarsh","Shubham", "Neelam"};
		List list4 = Arrays.asList(geeks);
		System.out.println("\n"+list4);

		String[] party = {"Rahul", "Utkarsh","Shubham", "Neelam"};
		List<String> list5 = new ArrayList<String>();
		Collections.addAll(list5, party);
		System.out.println("\n"+list5);


		//Iterating
		Iterator it = list1.iterator();
		while(it.hasNext())
		{
			System.out.println("@"+it.next());
		}

		ListIterator lt = list4.listIterator();
		while(lt.hasNext())
		{
			System.out.println("=>"+lt.next());

		}

		//Sorting

		Collections.sort(list1);
		//for custom sorting , we need to implement Comparator Interface


		//ArrayList to HashSet
		ArrayList companies = new ArrayList();
		companies.add("Sony");
		companies.add("Samsung");
		companies.add("Microsoft");
		companies.add("Intel");
		companies.add("Sony");

		System.out.println("Size of ArrayList before Converstion: " + companies.size());
		System.out.println(companies);
		HashSet companySet = new HashSet(companies);
		System.out.println("Size of HashSet after Converstion: " + companies.size());
		System.out.println(companySet);























	}


}
