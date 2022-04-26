
public class MulidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] twoD = new int[3][2];
		
		for (int i = 0; i < twoD.length; i++) 
		{
		for (int j = 0; j < twoD[i].length; j++)
		System.out.print(twoD[i][j] + " "); // print element
		System.out.println(); // time for a new row
		}
		
		
		for (int[] inner : twoD) {
			for (int num : inner)
			System.out.print(num + " ");
			System.out.println();
			}

	}

}
