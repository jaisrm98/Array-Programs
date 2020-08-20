package sorting;
import java.util.Scanner;
public class Binary_search {

	public static void main(String[] args) {
		
		int n,k,low=0,mid=0,high=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("enter value  be searched");
		k=sc.nextInt();
		high=n-1;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==k) {
				System.out.println(k+" found at "+(mid+1)+" position");
			break;
			}
			else if(arr[mid]<k)
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
				
		}
	}

}
