package coding;
import java.util.*;
public class Seperate_zeros_withArrayList {

	public static void main(String[] args) {
		Integer arr[]= {0,0,1,0,1};
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				list.add(arr[i]);
			}
			else
				list2.add(arr[i]);
		}
		for(Integer k:list)
			System.out.print(k);
		System.out.println();
		for(Integer z:list2)
			System.out.print(z);
		
	}

}
