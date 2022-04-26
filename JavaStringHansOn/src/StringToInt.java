
public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "123456 78 90";
		String a1= a.replaceAll("\\s", "");
		System.out.println(a1);
		

		
				int n = Integer.parseInt(a1);
				System.out.println(n);
				
		
	}

}
