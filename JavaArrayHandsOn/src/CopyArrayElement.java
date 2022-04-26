
public class CopyArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[5];
		int j=1;
		for(int i : num)
		{
			num[i]=12;
			//System.out.println(num1[k]);
			
		}
		
		int[] num1 = new int[num.length];
		for(int i= 0; i<num.length; i++)
		{
			for(int k =0 ; k<num1.length; k++)
			{
				num1[k] = num[i];
				System.out.println(num1[k]);
			}
			
		}
		

		
		
		

	}

}
