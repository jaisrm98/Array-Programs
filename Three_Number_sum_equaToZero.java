package coding;

public class Three_Number_sum_equaToZero {

	public static void main(String[] args) {
		int arr[]= {3,-1,-7,-4,-5,9,-4};
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					
					if(arr[i]+arr[j]+arr[k]==0)
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
				
				
			}
			
			
		}

	}

}

Output: -4 -5 9
	-5 9 -4
