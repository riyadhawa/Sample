package sample;

import java.util.Scanner;

class MaxElementArr {
	
	 public static void main(String []agrs)
		{
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Enter size of array : ");
	int N = scan.nextInt();
			
	int arr[]= new int [N];
	int even = 0 , odd =0;;
	
	System.out.print("Enter the elements of array: ");
	for (int i =0; i< N; i++)
		{
		arr[i] = scan.nextInt();
		
		if (arr[i] % 2 == 0)
			even++;
		else
			odd++;
		}
	System.out.println("The total number of even elements in the given array : " + even );
	System.out.println("The total number of odd elements in the given array : " + odd );

		}
	 
 }

