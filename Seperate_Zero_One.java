package coding;

public class Seperate_Zero_One {

	public static void main(String[] args) {
		int arr[]= {0,1,0,1,1};
		int n=arr.length;
		int zeros[]=new int[n];
		int ones[]=new int[n];
		int k=0;
		int l=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				zeros[k++]=arr[i];
			}
			else
				ones[l++]=arr[i];
		}
		for(int i=0;i<k;i++)
			System.out.print(zeros[i]+" ");
		System.out.println();
		for(int i=0;i<l;i++)
			System.out.print(ones[i]+" ");

	}

}
