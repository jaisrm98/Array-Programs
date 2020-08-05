package coding;
import java.util.*;
public class Sum_Of_Corners {

	public static void main(String[] args) {

		int m,n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		sum+=arr[0][0]+arr[0][n-1]+arr[m-1][0]+arr[m-1][n-1];

		System.out.println(sum);
	}

}

