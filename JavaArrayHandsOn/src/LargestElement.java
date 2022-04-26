import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[] num = {1, 4, 5,12, 456, 8, 9,20};
			
			int max =num[0];
			
			for(int i=0; i<num.length; i++)
			{
				if(num[i] > max)
					{
						max = num[i];
					}
					else {
						//max =num[i];
						
					}
				
				
			}
			
			System.out.println("MAX :"+max);
	}
	
	
	//int maximum = Arrays.stream(num).max().getAsInt()

}
