package coding;

public class Seperate_Zero_One {

	public static void main(String[] args) {
		int arr[]= {0,1,0,1,1};
		int zero=0;
		int ones=0;
		int d[]=new int[arr.length];
		int c[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==0)
			{
				zero++;
			}
			else
				ones++;
		}
			for(int j=0;j<zero;j++)
				 d[j]=0;
		for(int j=0;j<ones;j++)
			c[j]=1;
	
		for(int i=0;i<zero;i++)
		{
			System.out.print(d[i]);
		}
		System.out.println();
		for(int i=0;i<ones;i++)
		{
			System.out.print(c[i]);
		}

	}

}

Output: 00
	111
