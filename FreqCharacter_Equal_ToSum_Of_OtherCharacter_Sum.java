package coding;

import java.util.*;

public class FreqCharacter_Equal_ToSum_Of_OtherCharacter_Sum {
public static boolean fre(String s)
{
	char arr[]= s.toCharArray();
	char vis='A';
	int l=s.length();
	if(l%2==1)
		return false;
	int fr[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{ int c=1;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				c++;
				arr[j]=vis;
			}
		}
		if(arr[i]!=vis)
			fr[i]=c;
	}
	for(int i=0;i<arr.length;i++)
	{
		if(fr[i]==l/2)
			return true;
		
			
	}
	return false;
}
	public static void main(String[] args) {
		String s="geeksgeeks";
		boolean output=fre(s);
		if(output)
		System.out.println("YES");
		else
			System.out.println("NO");
		
		
	
	
	}
}

Ouput: NO
