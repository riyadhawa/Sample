package sample;
import java.util.Scanner;


public class MatrixAdd {

		
		public static void MatrixAdd(int matrix1 [][], int matrix2 [][],int N)
		{ // Method returns res [][]
			int resultant [][] = new int [N][N];

			for (int i=0; i< N; i++)
				for (int j=0; j< N; j++)
				resultant [i][j] = matrix1 [i][j]+ matrix2 [i][j]; 
			
			System.out.println("Resultant addition of given array matrix: "); // Print Resultant addition of 2 matrix
			for (int i=0; i< N; i++)
			{ for (int j=0; j< N; j++)
				{ 
				System.out.print (resultant[i][j] + " "); 
				}
				System.out.println(); 
			}
			
			
			}
		public static void main(String agrs[])
		{
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Enter the size of array matrix: "); 
			int N = scan.nextInt();

			int matrix1 [][] = new int [N][N];
			int matrix2 [][] = new int [N][N];

	        System.out.println("Enter the elements of 1st array matrix: "); // Read matrix 1
			for (int i=0; i< N; i++)
				for (int j=0; j< N; j++)
				matrix1 [i][j] = scan.nextInt();
			
	        System.out.println("Enter the elements of 2nd array matrix: "); // Read matrix 2
			for (int i=0; i< N; i++)
				for (int j=0; j< N; j++)
				matrix2 [i][j] = scan.nextInt();
			
			  MatrixAdd(matrix1, matrix2,N);                    // Call Method by name MatrixAdd 
			
			
		}


}
