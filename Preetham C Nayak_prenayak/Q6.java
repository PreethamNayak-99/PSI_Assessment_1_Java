import java.util.*;

//class Q6
public class Q6{
	//function which counts and returns zeros in the binary format of the number
		public static int CountZeros(int num){
		int c=0;
		//converting integer to binary format using toBinaryString() of Integer class
		String s1=Integer.toBinaryString(num);
		System.out.println("Binary representation of "+num+" is :"+s1);
		//converting the binary string to character array and traversing through it
		for(char ch:s1.toCharArray())
			if(ch=='0')
				c+=1;	//increment variable 'c' if 0 is found 
		return c;		
	}
	//main function
	public static void main(String args[]){
		int num;
		//scanner object to take inputs from user
		Scanner s=new Scanner(System.in);
		//asking user to enter the number
		System.out.print("Enter the number :");
		num=s.nextInt();
		
		//calling CountZeros() in print statement by passing the number entered by user
		System.out.println("Count of zeros :"+CountZeros(num));
	}
}