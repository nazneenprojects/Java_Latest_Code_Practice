import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordInStingSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String q = "Strive not to be a success, but rather to be of value.";
			String temp="";
			String[] a = q.split("\\s+");
			//System.out.println(Arrays.toString(a));
			
			for(int i =0; i<a.length; i++)
			{
				
				//System.out.print(reverseword(a[i]+ " "));
			temp +=  reverseword(a[i])+ " ";
				
			}
			
			System.out.print(temp.trim());
	}

	private static String reverseword(String string) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer(string);
		StringBuffer rev = s.reverse();
		
		//System.out.print(rev + " ");
		return rev.toString();
	}

}
