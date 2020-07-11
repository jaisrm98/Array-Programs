package sorting;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		int n;
		int k=2;
		int array2[]= {1,2};
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		// Arrays.sort(array);
			//System.out.println(k+" found at "+Arrays.binarySearch(array,k));
			System.out.println(Arrays.equals(array, array2));//check two arrays are equal or not
			//System.out.println(Arrays.toString(array));//represent array in a list form
		
	}

}
