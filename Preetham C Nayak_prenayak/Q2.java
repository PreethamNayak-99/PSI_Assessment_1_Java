import java.util.*;
//class Q2
public class Q2{
		public static void main(String args[]){
		//scanner object to take inputs from user
		Scanner s=new Scanner(System.in);
		
		//Asking user to enter 2 decimal numbers and initialize inputs taken from user to 2 variables
		System.out.print("\nEnter first number :");
		double n1=s.nextDouble();
		System.out.print("\nEnter second number :");
		double n2=s.nextDouble();
		
		System.out.print("\nNumbers are strictly less than 1 and strictly greater than 0 :");
		//check if numbers are strictly less than 1 and strictly greater than 0
		if(n1>0 && n2>0 && n1<1 && n2<1)
			System.out.println("true");
		else
			System.out.println("false");
		}
}