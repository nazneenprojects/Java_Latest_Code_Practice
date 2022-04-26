
public class RightRotateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {12, 4,5,6,23,78,12,9};
		
		int rotate = 3;
		
		for(int i = 0; i<rotate; i++)
		{
			int j , last = num[num.length-1];
			
			for(j = num.length-1; j> 0; j--)
			{
				//System.out.println(num[j]);
				num[j]= num[j-1];
				
				
			}
			
			num[0] = last;
			
			
		}
		
		
		for(int i =0 ; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		

	}

}
