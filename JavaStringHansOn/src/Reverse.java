
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Smile is the beautiful curv which sets everything straight";
		
		char[] c = s.toCharArray();
		String rev="";
		
		for(int i =s.length()-1; i>=0; i--)
		{
		
			rev = rev+s.charAt(i);
			
			//System.out.print(s.charAt(i));
			
			
		}
		
		
		System.out.print(rev);

	}

}
