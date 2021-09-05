package coding;
import java.util.*;
public class Diagonal_Sum_Of_Matrix {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int arr[][]=new int[n][n];
int sum=0;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		arr[i][j]=sc.nextInt();
		if(i==j || (i+j)==n-1)
			sum+=arr[i][j];
	}
}
System.out.println(sum);

	}

}

Input:  4
	1 1 1 1
	1 1 1 1
	1 1 1 1
	1 1 1 1
	
Output: 8
