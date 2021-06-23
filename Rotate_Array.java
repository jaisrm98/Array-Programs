package Practice;
import java.util.*;
public class Rotate_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n=2;
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=n;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			list.add(arr[i]);
		}
		
		for(int i:list)
		System.out.print(i+" ");
	}

}

Output: 3 4 5 6 7 1 2 
