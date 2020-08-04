package coding;

public class Shift_zero_left {

	public static void main(String[] args) {
		int arr[]= {1,0,1,0,1,1};
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				c++;
			}
		}
		for(int i=0;i<c;i++)
		{
			arr[i]=0;
		}
		for(int i=c;i<arr.length;i++)
			arr[i]=1;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
 Output: 0 0 1 1 1 1
