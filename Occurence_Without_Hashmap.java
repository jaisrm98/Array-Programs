package coding;

import java.util.Arrays;
import java.util.Collections;

public class Max_Freq_Of_Element {

	public static void main(String[] args) {
		int arr[]= {1,2,1,1,4,4,4,4,3};
		int n=arr.length;
		int freq[]=new int[n];
		for(int i=0;i<n;i++)
		{   
			int c=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
					c++;
				}
			}
			if(arr[i]!=-1)
				freq[i]=c;
						
		}
		for(int i=0;i<n;i++)
			if(arr[i]!=-1)
			System.out.println(arr[i]+" occurs "+freq[i]+" times");
		int max=freq[0];
		int k=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>max) {
				max=freq[i];
			k=arr[i];}
		}
			System.out.println(k+" have max frequency "+max);
			
	}

}


Output: 1 occurs 3 times
	2 occurs 1 times
	4 occurs 4 times
	3 occurs 1 times
	4 have max frequency 4
