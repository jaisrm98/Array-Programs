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
