package coding;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Array {

	public static void main(String[] args) {
		
		int n;
		int k=0;
		int b[]= {2,3};
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int l1=a.length;
		int l2=b.length;
		
		int sum=l1+l2;
		int c[]=new int[sum];
		for(int i=0;i<l1;i++)
		{
			c[i]=a[i];
			k++;
	}
		for(int i=0;i<l2;i++)
		{
			c[k++]=b[i];
			
	}

		for(int i=0;i<sum;i++)
		{
			System.out.print(c[i]+" ");
			
		}
		}
}
