import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> m1 = new HashMap<String, String>();
		
	m1.put("e1", "NAzneen");
	m1.put("e2", "NAzneen");
	m1.put("e3", "NAzneen");
	m1.put("e4", "NAzneen");
	m1.put("e1", "NAzneen");
	m1.put("e1", "Mulani");
	
	System.out.println(m1);
	for (Entry<String, String> m :m1.entrySet()) 
	{

       // Printing keys
       System.out.print(m.getKey() + ":");
       System.out.println(m.getValue());
   }
	
	

	}

}
