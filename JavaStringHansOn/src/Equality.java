
public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equality t1 = new Equality();
		Equality t2 = new Equality();
		Equality t3 = t1;
		 System.out.println(t1 == t1); // true
		 System.out.println(t1 == t2); // false
		 System.out.println(t1.equals(t2)); // false
		 System.out.println(t1 == t3); // false
		 System.out.println(t2.equals(t3)); // false

	}

}

