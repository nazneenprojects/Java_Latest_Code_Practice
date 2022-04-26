import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };

public class SetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s1 = new HashSet<Integer>();

		Set<Integer> s2 = new LinkedHashSet<Integer>();

		Set<Integer> s3 = new TreeSet<Integer>();


		s1.add(12);
		s1.add(3);
		s1.add(3);
		s1.add(89);
		s1.add(90);
		s1.add(65);
		s1.add(null);

		s1.size();

		//System.out.println(s1);

		System.out.println(s1);
		s2.add(12);
		s2.add(3);
		s2.add(3);	
		s2.add(89);
		s2.add(90);
		s2.add(65);
		s2.add(null);
		s2.size();
		System.out.println(s2);

		s3.add(12);
		s3.add(3);
		s3.add(3);	
		s3.add(89);
		s3.add(90);
		s3.add(65);
		//s3.add(null);  No allowed
		s3.size(); 
		System.out.println(s3);

		
		
		//operations
		Set<Integer> a = new HashSet<Integer>();

		// Adding all elements to List
		a.addAll(Arrays.asList(
				new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

		// Again declaring object of Set class
		// with reference to HashSet
		Set<Integer> b = new HashSet<Integer>();

		b.addAll(Arrays.asList(
				new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference of the two Set");
		System.out.println(difference);


		//-------------
		Set<Gfg> set1;

		// Adding the elements
		set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,
				Gfg.LEARN, Gfg.CODE);

		System.out.println("Set 1: " + set1);



		//















	}

}
