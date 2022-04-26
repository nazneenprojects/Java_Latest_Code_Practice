
public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] strings = { "stringValue" };
		 Object[] objects = strings;
		 String[] againStrings = (String[]) objects;
		 //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		 //objects[0] = new StringBuilder();

	}

}
