import java.util.*;

//class Q3
public class Q3{
	public static void main(String arg[]){
		//scanner object to take inputs from user
		Scanner s=new Scanner(System.in);
		
		int m,n;
		//Asking user to enter number of rows and colums
		System.out.print("Enter number of rows and number of columns for array :");
		m=s.nextInt();
		n=s.nextInt();
		
		//allocating memory for a boolean array
		boolean[][]A=new boolean[m][n];
		int i,j;
		
		//Asking user to enter array elements
		System.out.println("\nEnter boolean array elements :0 for false and 1 for true");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				int v=s.nextInt();
				//if value entered is 0 store false in array and store true if it is 1
				if(v==0)		
					A[i][j]=false;
				else
					A[i][j]=true;
			}
		}
		System.out.println("Output");
		//Traverse through array and print t if true and f if false accordingly
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(A[i][j]==true)
					System.out.print("t ");
				else
					System.out.print("f ");
			}
			System.out.print("\n");
		}
	}
}