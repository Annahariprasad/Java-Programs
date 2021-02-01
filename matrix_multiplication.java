import java.util.Scanner;

public class matrix_multiplication {

	public static void main(String[] args) {
		// Matrix Multiplication
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter first 3*3 matrix values : ");
		int[][] m1 = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Enter m1["+i+"]["+j+"]"+ " number : ");
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nEnter second 3*3 matrix values : ");
		int[][] m2 = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Enter m2["+i+"]["+j+"]"+ " number : ");
				m2[i][j] = sc.nextInt();
			}
		}
		int[][] m3 = new int[3][3];
		System.out.println("\nMultiplication of matrices : \n");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				m3[i][j]=0;      
				for(int k=0;k<3;k++){      
					m3[i][j]+=m1[i][k]*m2[k][j];      
				}
				System.out.print(m3[i][j]+" ");  
				}
				System.out.println();
			}    
		}
	}  
