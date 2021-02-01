import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// Searching the element
		int arr[] = {10,20,30,40,50};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Element for search : ");
		int key = scan.nextInt();
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Element found in position - "+i);
				found  = true;
				break;
			} 
		}
		if(!found) {
			System.out.println("Element is not found.");
		}
	}

}
