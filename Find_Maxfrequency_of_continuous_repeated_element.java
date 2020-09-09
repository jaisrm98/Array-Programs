package coding;

public class Find_Maxfrequency_of_continuous_repeated_element {

	public static void main(String[] args) {
		int arr[]= {1,0,1,1,1,0,1,1};
		int c=0;
		int result=0;
		for(int i:arr)
		{
			if(i==1)
			{
				c++;
				result=Math.max(result, c);
			}
			else
			{
				c=0;
			}
		}
		System.out.println(result);

	}

}

Output: 3                       // 1 1 1
