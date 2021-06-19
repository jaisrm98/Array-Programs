package coding;
import java.util.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i=0;
		int arr[]=new int[65];
		while(n!=0)
		{
			arr[i]=n%2;
			n=n/2;
			i++;
		}
		for( i=i-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

}

Input: 2
Output: 10
