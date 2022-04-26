import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "MADAM";
		String s2 = "DAMAM";
		
		anagramCheck(s1, s2);
		

	}

	private static void anagramCheck(String s1, String s2) {
		// TODO Auto-generated method stub
		
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}
