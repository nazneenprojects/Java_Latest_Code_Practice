import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MADAM";
		
		char[] c = s.toCharArray();
		char[] c1 = new char[s.length()];
		
		StringBuffer s1 = new StringBuffer(s); 
		StringBuffer s2 = s1.reverse();
		
		if(s1.equals(s2))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		
		
	}
	
	
	//Call this function to reverse the string without using any in built method
	public static String reverseString(String str) {
        String reversedString = "";
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
 
        }
        return reversedString;
    }

}
