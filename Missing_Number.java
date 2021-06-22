package Practice;

public class Missing_Number {
	static int missing(int arr[])
	{
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==i)
				continue;
			else
			{
				k=i;
				break;
				
			}
		}
		
		return k;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,6,7};
		System.out.println(missing(arr));

	}

}

Output: 5
