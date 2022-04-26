import java.util.StringTokenizer;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String q = "Fortune favours the bold";
		
		//1
		String[] a = q.split("\\s+");
		
		System.out.println(a.length);
		
		
		//2
		if (!q.isEmpty()) {
	        StringTokenizer stringTokenizer = new StringTokenizer(q); // create StringTokenizer using the
	                                                                            // inputString
	 
	        System.out.println(stringTokenizer.countTokens()); // returning the number of tokens i.e. number of words
	    }
		
		//3
		
		int wordCount = 0;
	    int endOfString = q.length() - 1;
	 
	    String str = q.trim(); // making sure that string should not have any spaces at the starting and
	                                        // ending
	    
	  //  System.out.println(str);
	    
	    for (int i = 0; i < q.length(); i++) {
	 
	        if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
	 
	            wordCount++;
	 
	        } else if (str.charAt(i) == ' ' && str.charAt(i++) == ' ') { // if there is more than one space in between
	                                                                        // string
	            i++;
	 
	        } else if (i == endOfString) { // matching the first missing word
	 
	            wordCount++;
	        }
	    }
		
		System.out.println(wordCount);
		
		
	}

}
