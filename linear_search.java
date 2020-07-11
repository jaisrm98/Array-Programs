package sorting;
import java.util.Scanner;
public class linear_search {

	public static void main(String[] args) {
		
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter value to be searched ");
		k=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				System.out.println(k+" is present at "+(i+1)+" position");
				found=true;
			
			}
			
		}
		if(!found) {
			System.out.println("not found");
		}
				
		
		 
				

}
}
