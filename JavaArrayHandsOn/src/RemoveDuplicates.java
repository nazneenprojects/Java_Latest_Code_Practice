import java.util.HashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {12,19,29,44,66,69,70};


		//---------------from Sorted Array--------------------------------
		//---------------------using Temp Array---------------------------

		System.out.println("using Temp Array");
		
		//for unsorted Arrays
		// Arrar.sort(num);

		int temp[] = new int[num.length];
		int j=0;

		for(int i=0; i< num.length-1; i++)
		{
			if(num[i]!=num[i+1])
			{
				temp[j++]=num[i];
			}


		}

		temp[j++] = num[num.length-1];    


		for(int k=0 ; k<temp.length; k++) 
		{ 
			System.out.print(temp[k]+"  "); 
		}



		//-------------------using HashSet & Unsorted Array------------------------
		System.out.println("\n using Set");

		int a[] = {12,12,2,44,55,66,26,70};

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		System.out.print(set);



		//-------------------using Map & Unsorted Array------------------------
		System.out.println("\n using Map");
		int a1[] = {12,12,2,44,55,66,26,70};
		HashMap<Integer, Boolean> mp = new HashMap<>();
		for (int i = 0; i < a1.length; ++i) {


			if (mp.get(a1[i]) == null)
			{
				System.out.print(a1[i] + " ");
				mp.put(a1[i], true);
			}
		}
		
		


	}

}
