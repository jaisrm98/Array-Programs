package coding;
import java.util.*;
public class Elite_N {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int d=1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int x=k;
		for(int i=0;i<n;)
		{
			if(k>arr[i])
			{
				k=k-arr[i];
				i++;
			}
			else
			{
				k=x;
				d++;
			}
				
		}
		System.out.println("day= "+d);
	}

}

Input:  7
	1 2 4 7 2 5 5
	10
	
Output: day= 4 
	
	Explanation 
	On the first day you defeat 1st, 2nd and 3rd opponent. As the remaining power would be 3,
	you can't battle the 4th one. So you take rest. On the 2nd day, you defeat the 4th and the 5th opponent, then take rest.
	On the 3rd day, you defeat the 6th enemy only. As you cannot let your pokemon faint, you will have to take rest. 
	On the 4th day you defeat the last of the Elite N and become the champion! :D 
