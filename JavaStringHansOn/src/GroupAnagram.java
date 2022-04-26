import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input: strs = ["eat","tea","tan","ate","nat","bat"]
		//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		
		String[]  strs = {"eat","tea","tan","ate","nat","bat"};
				
	    groupAnagramsCategorizeBySorting(strs);
		
		
		
 }

	private static List<List<String>> groupAnagramsCategorizeBySorting(String[] strs) {
		if (strs == null || strs.length == 0)
		      return new ArrayList<>();

		    Map<String, List<String>> stringAnagramsMap = new HashMap<>();
		    for (String s : strs) {
		      char[] arr = s.toCharArray();
		      Arrays.sort(arr);
		      String key = String.valueOf(arr);

		      if (!stringAnagramsMap.containsKey(key))
		        stringAnagramsMap.put(key, new ArrayList<>());

		      stringAnagramsMap.get(key).add(s);
		    }

		    List<List<String>> resultList = new ArrayList<>();
		    for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
		      resultList.add(stringAnagrams.getValue());
		    }
		    
		    for(List<String> s: resultList)
		    {
		    	System.out.print(s);
		    }
		    return resultList;
	}
	
	/*String[] str = {"eat","tea","tan","ate","nat","bat"};
	
	List<String> l1 = new ArrayList<>();
	List<List<String>> output = new ArrayList<>();
	String str1="";
	
	for(int i = 0; i<str.length; i++)
	{
		for(int j =i+1; j<str.length; j++)
		{
		//System.out.println(str[i]);
			
		if(! l1.contains(str[i]))
			   {
			l1.add(str[i]);
			   }
		  
  		   if(checkAnagram(str[i], str[j]))
			{
  			  if(! l1.contains(str[j]))
  			   {l1.add(str[j]);}
  		   }
	     }
	}
	

	
	for(String s : l1)
	{
		System.out.println(s);
	}

	
	

}

private static boolean checkAnagram(String string1, String string2) {
	// TODO Auto-generated method stub
	
	char[] c1 = string1.toLowerCase().toCharArray();
	char[] c2 = string2.toLowerCase().toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(Arrays.equals(c1, c2))
	{
		//System.out.println("Anagram");
		return true;
	}
	else {
		//System.out.println("Not Anagram");
		return false;
	}

	
}
*/
}