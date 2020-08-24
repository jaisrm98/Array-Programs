package coding;

import java.util.ArrayList;
import java.util.Arrays;

public class thirdLargest_In_repeatedElements {

	public static void main(String[] args) {
		Integer arr[]= {2,2,3,1};
		
		 
		 ArrayList<Integer>list=new ArrayList<Integer>();
	       for(int i=0;i<arr.length;i++)
			{
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
					
				}
					
			}
	       int n=list.size();
	       Integer arr1[]=new Integer[n];
	        arr1=list.toArray(arr1);
	    
      
	      Arrays.sort(arr1);
	       int max=0;
	       if(arr1.length>=3){
	                max=arr1[arr1.length-3];
	       }
	        else
	        {
	            max=arr1[arr1.length-1];
	        }
	       System.out.println(max);

	}

}
