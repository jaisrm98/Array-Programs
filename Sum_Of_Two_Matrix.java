package coding;

import java.util.Scanner;

public class Sum_Of_Two_Matrix {

	public static void main(String[] args) {
		int m,n;
		
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		int arr1[][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("First matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		 
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
	    }
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}

Input:  2
	2
	First matrix
	2 2
	2 2
	Second matrix
	2 2
	2 2
	
Output: 4 4 
        4 4
