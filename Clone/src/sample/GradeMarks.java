package sample;

import java.util.Scanner;
public class GradeMarks 
{
	 public static void main (String agrs[])
	 {Scanner scan = new Scanner (System.in);

			System.out.print("Enter the marks scored: ");
			int marks = scan.nextInt();
			
		 if (marks < 50)
			 System.out.println("You have got F Grade");

		 else if (marks >= 50 && marks < 60)
			 System.out.println("You have got D Grade");
		 
		 else if (marks >= 60 && marks < 70)
			 System.out.println("You have got C Grade");
		 
		 else if (marks >= 70 && marks < 80)
			 System.out.println("You have got B Grade");
		 
		 else if (marks >= 80 && marks < 90)
			 System.out.println("You have got A Grade");
		 
		 else if (marks > 90)
			 System.out.println("You have got A+ Grade");
		 } 
	 }

