//Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

package coding;
import java.util.*;
public class Maxdifference {
	static int difference(int arr[],int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				if(arr[j]>arr[i] && (j-i)>max)
					max=(j-i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int output=difference(arr, n);
		System.out.println("max distance "+output);

	}

}
Input: 3 5 4 2
Output: max distance 2

//  Maximum value occurs for pair (3, 4).
