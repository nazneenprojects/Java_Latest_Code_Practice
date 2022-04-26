import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class duplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print duplicate char
		//print count of duplicate char
		
		String str = "The biggest risk is not taking any risk";
		
		System.out.println("1. using java 8"+
		str.chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting())));
		
		System.out.println("2. using loops+Array:");
		
		ArrayList<Character> al = new ArrayList<>();
		int count=0;
		for(int i = 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
		
			for(int j =0; j<str.length(); j++)
			{
				if(str.charAt(j)!= ch)
				{
					continue;
				}
				count++;
				
			}
			
			if(!al.contains(ch) && ch!=' ')
			{
					System.out.println("Char:"+ch+ "\t\t\t Count:"+count);
					al.add(ch);
				
		
				
			}
			
			count=0;
			
			
			
		}
		
		
		
		
		
		

	}

}
