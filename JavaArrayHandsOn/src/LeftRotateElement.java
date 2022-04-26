
public class LeftRotateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,3,4,1,6,3,8,5,6};
		
		int rotate = 2;
		
		for(int i =0; i<rotate; i++)
		{	 int j, first=num[0] ;
			
		 for( j =0; j<num.length-1; j++)
		 { 	 
			num[j] = num[j+1];
			 
			
		 }
		 num[j]=first;
		}
		
		for(int i = 0; i< num.length; i++){  
            System.out.print(num[i] + " ");  
        }  
		
		
	}

}
