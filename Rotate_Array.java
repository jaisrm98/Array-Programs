package coding;
import java.util.*;
public class Rotate_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		//String str="a b c d e";        //for string rotation
		 // String [] arr = str.split(" ");
		  
		  int n=3;
		  int j; 
		  int first;
		  for(int i=0;i<n;i++)
		  {
			  
		  first=arr[0];
		  for(j=0;j<arr.length-1;j++)
		  {
			  arr[j]=arr[j+1];
		  }
		  arr[j]=first;
		  }
		  System.out.println("left rotation");
		  for(int i=0;i<arr.length;i++)
			  System.out.print(arr[i]+" ");
	}
}
 
Input: 3
Output: 4 5 1 2 3
