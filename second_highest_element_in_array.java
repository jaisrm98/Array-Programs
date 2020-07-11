package sorting;
import java.util.Scanner;
public class second_highest_element_in_array {

	public static void main(String[] args) {
		
		int n,k,low,mid=0,high=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
			int temp;
		 
		System.out.println("numbers in sorted order:");
		for (int i = 0; i <n; i++) {
	   	   for (int j = i + 1; j < n; j++) {
			
			if (arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
	   	   }
		   
	   	   
		   System.out.println(arr[i]);
		}
		System.out.println("second highest is");
		 System.out.println(arr[n-2]);
	}
	}