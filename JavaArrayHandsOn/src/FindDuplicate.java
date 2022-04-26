
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {2,5,8,6,2,8,20,5};
		
		System.out.println("Duplicate element" );
		
		for(int i = 0; i<num.length; i++)
		{
			for(int j =i+1; j<num.length; j++)
			{
				if(num[i]==num[j])
				{
					System.out.print(num[j]+ "  ");
				}
			}
			
		}
		
		

	}

}
