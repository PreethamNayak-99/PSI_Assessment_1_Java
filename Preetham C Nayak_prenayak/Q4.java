import java.util.*;
//class Q4
class Q4{
	public static void main(String args[]){
		int m,n;
		//scanner object to take inputs from user
		Scanner s=new Scanner(System.in);
		//Asking user to enter number of rows and colums
		System.out.print("Enter number of rows and number of columns for array :");
		m=s.nextInt();
		n=s.nextInt();
		
		//allocating memory for 2d array
		int[][] A=new int[n][m];
		int i,j;
		//asking user to enter array elements
		System.out.println("Enter array elements");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				A[j][i]=s.nextInt();//store the elements in transpose matrix
			}
		}
		System.out.println("Output");
		//Printing array
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}