package coding;
import java.util.*;
public class Sum_Of_Boundry_Elements {

	public static void main(String[] args) {
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		int sum=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		 
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==m-1||j==n-1)
					sum+=arr[i][j];
			}
		}
		System.out.println(sum);
		
		
		
	}

}
