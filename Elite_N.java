package coding;
import java.util.*;
public class Elite_N {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int d=1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int x=k;
		for(int i=0;i<n;)
		{
			if(k>arr[i])
			{
				k=k-arr[i];
				i++;
			}
			else
			{
				k=x;
				d++;
			}
				
		}
		System.out.println("day= "+d);
	}

}

Input:  7
	1 2 4 7 2 5 5
	10
	
Output: day= 4
	
	
	
