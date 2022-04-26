import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,4,5,6,2,1,1,3,5,2,7,9,5,9,3,9,4};
		int[] freq = new int[arr.length];
		
		int visited =-1;
		for(int i=0; i<arr.length; i++)
		{
			 int count = 1;  
			
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					count++;
					freq[j] = visited;
				}
			}

			
			if(freq[i]!=visited)
			{
				
				freq[i] = count;
			}
			
		}
		
		
		
		for(int i = 0; i < arr.length; i++){  
            if(arr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + freq[i]);  
        }  
        System.out.println("----------------------------------------");  
		
		
		
		
		
		

   // for (Map.Entry<Integer,Integer> entry : m.entrySet()) {
   //int key = entry.getKey();
   //int value = entry.getValue();
    
   // System.out.println(key + "   --->   "+ value);


	}

}
