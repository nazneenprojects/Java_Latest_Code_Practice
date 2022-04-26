import java.util.Arrays;
import java.util.stream.Collectors;

public class convertArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"The", "only", "time", "I", "don't",  "work",  "is", "when", "I", "am",  "asleep"};
		
		operationArrayToString(arr);
		

	}

	private static void operationArrayToString(String[] arr )  {
		// TODO Auto-generated method stub
		
		System.out.println("using Array.toString():  "+Arrays.toString(arr));
		
		
		StringBuilder sb = new StringBuilder();
		 for(int i =0; i<arr.length; i++)
		 {
			 sb.append(arr[i]);
		 }
		
		 System.out.println("using StringBuilder:  "+sb);
		
		 
		 String temp = null;
		 for(int i =0; i<arr.length; i++)
		 {
			temp= String.join(" ", arr);
		 }
		 System.out.println("using string join():  "+temp);
		 
		 
		 String str = Arrays.stream(arr).collect(Collectors.joining());
		 System.out.println("using stream joining():  "+str);
		 
		 
		 
	}

}
