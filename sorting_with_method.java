package sorting;
import java.util.Scanner;
import java.util.Arrays;
public class sorting_with_method {



	public static void main(String[] args) {
		
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();

	System.out.println("enter values of array");
	int arr[]=new int [n];
	 
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	
	Arrays.sort(arr); 
	
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
		
	System.out.println();
	 System.out.printf( Arrays.toString(arr));
	}
}