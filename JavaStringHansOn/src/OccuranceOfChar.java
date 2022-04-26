
public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Nazneen Mulani";
		String f = s.toLowerCase();;
		int count=0;
		
		
		
		for(int i = 0; i <f.length(); i++)
		{
			if(f.charAt(i) =='n')
			{
				count++;
			}
		}
		
		System.out.println("Count of gievn char" + count + "///"+ s.length());
	}

}
