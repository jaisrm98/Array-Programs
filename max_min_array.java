package sorting;
import java.util.Scanner;
public class max_min_array {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++)
			if(arr[i]>max)
				max=arr[i];
		for(int i=0;i<n;i++)
			if(arr[i]<min)
				min=arr[i];
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		
			
		
		
		
	}

}
