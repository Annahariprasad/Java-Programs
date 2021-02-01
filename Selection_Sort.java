import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		// Selection Sort
		System.out.println("\t\tWelcome to Selection Sort\t\t");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many values you want to insert in the array : ");
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter a["+i+"]element : ");
			a[i] = scan.nextInt();
		}
		System.out.print("Before Sorting : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(a[min]<a[j]) {
					min = j;
				} else {
					int temp = a[j];
					a[j] = a[min];
					a[min] = temp;
				}
			}
		}
		System.out.print("\nAfter Sorting : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
