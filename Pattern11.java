
public class Pattern11 {

	public static void main(String[] args) {
		// Pattern 11
		char alpha[] = {'A','B','C','D','E'};
		System.out.println("First Method\n");
		for(char i='A'; i<='E'; i++) {
			for(char j=i; j<='E'; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\nSecond Method\n");
		for(int i=0; i<alpha.length; i++) {
			for(int j=i; j<alpha.length; j++) {
				System.out.print(alpha[j] + " ");
			}
			System.out.println();
		}

	}

}
