package sorting;
import java.util.Scanner;

public class Bubble_sort {
	   public static void main(String []args) {
		   int n;
		   Scanner sc=new Scanner(System.in);
		   n=sc.nextInt();
		   sc.nextLine();
		  
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int temp=0;
		 
		System.out.println("numbers in sorted order:");
		for (int i = 0; i <n; i++) {
	   	   for (int j = i + 1; j < n; j++) {
			
			if (ar[i]<ar[j])
			{
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
	   	   }
		   
	   	   
		   System.out.print(ar[i]+" ");
			
	   	   
		}
	   }
	}
