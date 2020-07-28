package coding;
import java.util.*;
public class Kth_Largest_element_In_Array {

	public static void main(String[] args) {
		int n,temp=0,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("\nEnter the Kth value");
		k=sc.nextInt();
		System.out.println("\n the Kth largest value is "+(arr[n-k]));
	}

}
