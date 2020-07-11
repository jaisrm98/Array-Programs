package sorting;
import java.util.Scanner;
public class avg_of_array {

	public static void main(String[] args) {
	int avg,sum=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	System.out.println("enter values of arrray");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	for(int i=0;i<n;i++) 
	{
		sum=sum+arr[i];
	}
avg=sum/n;
System.out.println("avg is "+avg);
	}

}
