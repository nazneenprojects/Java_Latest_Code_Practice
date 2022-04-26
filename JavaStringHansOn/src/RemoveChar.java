
public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Aurora".toLowerCase();
		
		char c = 'a';
		String s1="";
		
		//char[]  c1 = new char[s.length()];

		for(int i =0; i<s.length(); i++)
		{
			if(s.contains("a"))
			{
				s1 = s.replaceAll("a", "");
			}
			
		}
		
		System.out.println(s1);
	}

}
