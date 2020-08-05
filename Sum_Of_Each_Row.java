package coding;
import java.util.*;
public class Sum_Of_Each_Row {

	public static void main(String[] args) {
int row,col;
Scanner sc=new Scanner(System.in);
row=sc.nextInt();
col=sc.nextInt();
int arr[][]=new int[row][col];
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		arr[i][j]=sc.nextInt();
	}
}
	for(int i=0;i<row;i++)
	{
		int rowsum=0;
		for( int j=0;j<col;j++)
		{
			rowsum+=arr[i][j];
		}
		System.out.println((i+1)+" row sum= "+rowsum);
	}
	for(int j=0;j<col;j++)
	{ 
		int colsum=0;
		for(int i=0;i<row;i++)
		{
			colsum+=arr[i][j];
		}
		System.out.println((j+1)+" col sum= "+colsum);

	}
	
	}

}

Input:  3
	3
	1 2 1
	1 1 1
	3 3 3
	
Output: 1 row sum= 4
	2 row sum= 3
	3 row sum= 9
	1 col sum= 5
	2 col sum= 6
	3 col sum= 5
