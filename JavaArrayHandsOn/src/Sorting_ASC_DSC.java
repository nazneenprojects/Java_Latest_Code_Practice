
public class Sorting_ASC_DSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the nth largest number in an array in java by sorting the array and
		// returning the nth largest number
		//Same logic applies for nth smallest number
		
		//Arrays.sort(strarray, Collections.reverseOrder());   
		//System.out.println("Array elements in descending order: " +Arrays.toString(strarray));  
		
		
		int [] num = {13, 5, 23, 78, 87,3,7,5,90,134,65};
		
		//ASCENDING
		System.out.println("ASCENDING");
		
		int min = num[0];
		
		for(int i =0; i< num.length; i++)
		{
			for(int j =i+1 ; j<num.length; j++)
			{
				if(num[i]>num[j])
				{
				int temp = num[i];
				num[i]=num[j];
				num[j]= temp;	
					
				}
				else {
					
					
				}
				
				
			}
			
		}
		
		for(int j =0; j<num.length; j++)
		{
			System.out.println(num[j]);
		}
		
		
		
		
		//DESCENDING
		System.out.println("DESCENDING");
	int max = num[0];
		
		for(int i =0; i< num.length; i++)
		{
			for(int j = i+1 ; j<num.length; j++)
			{
				if(num[i]<num[j])
				{
				int temp = num[j];
				num[j]=num[i];
				num[i]= temp;	
					
				}
				else {
					
					
				}
				
				
			}
			
		}
		
		for(int j =0; j<num.length; j++)
		{
			System.out.println(num[j]);
		}
		

	}

}
