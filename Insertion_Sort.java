import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		// Insertion Sort
		System.out.println("\t\tWelcome to Insertion Sort\t\t");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number how many numbers you want to insert in the array : ");
		int n = scan.nextInt(); 
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter a["+i+"] element : ");
			a[i] = scan.nextInt();
		}
		System.out.print("Before Sorting : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=1; i<n; i++) {
			int key = a[i];
			for(int j=i-1; j>=0; j--) {
				if(a[j]>key) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				} 
			}
		}
		System.out.print("\nAfter Sorting : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
