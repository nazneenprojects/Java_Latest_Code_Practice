import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v1 = new Vector();

		Vector v2 = new Vector(5);

		Vector v3 = new Vector(10, 2);

		System.out.println("for V1  :"+v1.capacity() + "---&--"+ v1.size());
		System.out.println("for V2  :"+v2.capacity() + "---&--"+ v2.size());
		System.out.println("for V3  :"+v2.capacity() + "---&--"+ v2.size());

		v2.add("make");
		v2.add("peace");
		v2.add("with");
		v2.add("your");
		v2.add("broken");
		v2.add("pieaces");

		System.out.println(v2);
		System.out.println("for V2  :"+v2.capacity() + "---&--"+ v2.size());

		Vector v4 = new Vector(v2);
		System.out.println(v4);
		System.out.println("for V4  :"+v4.capacity() + "---&--"+ v4.size());

		v4.retainAll(v1);

		System.out.println(v4);



		//-------------------------------Array to Vector ------------------------------------------

		String[] arr = { "I", "love", "geeks", "for", "geeks" };

		Vector<String> v = new Vector<String>();

		Collections.addAll(v, arr);
		// or  Vector<String> v = new Vector<String>(Arrays.asList(arr));
		// or using looping & addElement()

		System.out.println("The vector is");

		System.out.println(v);


		//------------------------------- Vector to Array------------------------------------------
		Object[] array1 = v2.toArray();
		String[] array2 = Arrays.copyOf(array1, array1.length, String[].class);
		System.out.println("Array: "  + Arrays.toString(array2));

		//or
		 Vector<String> vector = new Vector<String>();
	        vector.add("G");
	        vector.add("e");
	        vector.add("e");
	        vector.add("k");
	        vector.add("s");

		String[] array3 = vector.toArray(new String[vector.size()]);

		System.out.println("Array: " + Arrays.toString(array3));




















	}

}
