import java.util.*;

//class Q5
public class Q5{
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		int n,k,i;
		//asking user to enter number of elements in array
		System.out.print("Enter the number of elements in the array :");
		n=s.nextInt();
		//allocating memory for array
		int[] A=new int[n];
		
		//asking user to enter array elements
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++)
			A[i]=s.nextInt();
		
		//sorting array
		Arrays.sort(A);
		
		//asking user to enter number of largest elements to print
		System.out.print("Enter the number of largest element to find :");
		k=s.nextInt();
		//Printing k elements from the end of sorted array
		System.out.println(k+" largest elements in the array");
		for(i=n-1;i>=n-k;i--)
			System.out.print(A[i]+" ");	
	}
}