package coding;
import java.util.*;
public class Max_distance_bt_repeated_element {
	static int difference(int arr[],int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				if(arr[j]==arr[i] && (j-i)>max)
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

Input:  13
	1 2 3 2 5 1 2 4 6 2 7 8 6
Output: max distance 8
