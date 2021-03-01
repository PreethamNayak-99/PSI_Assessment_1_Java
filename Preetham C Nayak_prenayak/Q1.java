import java.util.*;
//class Q1
public class Q1{
	public static void main(String args[]){
		//scanner object to take inputs from user
		Scanner s=new Scanner(System.in);
		
		
		// asking user to enter 4 numbers and initialize inputs taken from user to 4 variables
		System.out.print("\nEnter first number :");
		int n1=s.nextInt();
		System.out.print("\nEnter second number :");
		int n2=s.nextInt();
		System.out.print("\nEnter third number :");
		int n3=s.nextInt();
		System.out.print("\nEnter fourth number :");
		int n4=s.nextInt();
		
		//Check if all numbers are equal or not
		if(n1==n2 && n2==n3 && n3==n4)
			System.out.println("\nNumbers are equal.");
		else
			System.out.println("\nNumbers are not equal.");
	}
}