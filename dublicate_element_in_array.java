
package sorting;
import java.util.Scanner;
public class dublicate_element_in_array {

	public static void main(String[] args) {
		
		int n;
		int c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j]) {
					 
					System.out.print(arr[i]+" ");
					c++;
				}
				
					
			}
		}
		System.out.println("total dublicate= " +c);
		System.out.println("total dublicate elements= " +c*2);
	}

}

	Input:	5
		1 1 2 2 3
	Output:	1 2 total dublicate= 2
		total dublicate elements= 4         //1 1 2 2
