
public class EvenPositionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = {12,4,6,3,9,02, 4, 67,1}; 
		
		/*
		 * for(int i =1; i< num.length; i++) {
		 * 
		 * if(i%2==0) { System.out.print( num[i]+ "  ");
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		
		System.out.println("\n --------Even-------");
		
		
		for (int i = 1; i < num.length; i = i+2) {  
            System.out.println(num[i]);  
        }  
		
		System.out.println("\n --------odd-------");
		
		
		for (int i = 0; i < num.length; i = i+2) {  
            System.out.println(num[i]);  
        }  
		

	}

}
