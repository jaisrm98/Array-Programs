package coding;
import java.util.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		int n=6;
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		while(n>0)
		{
			list.add(n%2);
			n=n/2;
		}
		int size=list.size();
		
		for(int i=size-1;i>=0;i--)
			System.out.print(list.get(i)+"");
	}

}

Input: 6
Output: 110
