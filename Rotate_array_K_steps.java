package Practice;
import java.util.*;
import java.util.ArrayList;

public class Rotate_k_Times {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n=3;
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		for(int i=arr.length-n;i<arr.length;i++)
			list.add(arr[i]);
		
		for(int i=0;i<arr.length-n;i++)
			list.add(arr[i]);
		
		for(int i:list)
			System.out.print(i+" ");

	}

}


Output: 5 6 7 1 2 3 4
