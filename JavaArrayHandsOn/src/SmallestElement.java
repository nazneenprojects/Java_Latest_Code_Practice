import java.util.Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num  = {23, 45, 12,67,78,2,-1};
		
		int min = num[0];
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]<min)
			{
				min = num[i];
				
			}
			
		}

		
		System.out.println("Min:"+ min);
	}
	
	
	// java 8
	//int minimum = Arrays.stream(num).min.getAsInt();

}
