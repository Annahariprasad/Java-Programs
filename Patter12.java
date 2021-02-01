
public class Patter12 {

	public static void main(String[] args) {
		// Patter 12
		String word = "HELLO";
		char arr[] = word.toCharArray();//Convert the String into Character Array : ['H','E','L','L','O']
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}

}
