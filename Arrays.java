import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many number you want to insert : ");
		int n = scan.nextInt();
		int numbers[] = new int[n];
		System.out.println("These are numbers : ");
		for(int i=0; i<n; i++) {
			numbers[i] = scan.nextInt();
		}
		System.out.print("Elements are : ");
	    for(int i=0; i<n; i++) {
	    	System.out.print(numbers[i] + "\t");
	    }
	    /*System.out.println("This is Multi-dimensional Array : ");
	    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }*/
		
	}

}
