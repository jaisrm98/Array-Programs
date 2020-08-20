package coding;
import java.util.*;
public class Occurence_of_element {

	public static void main(String[] args) {
		 int [] arr = new int [] {1,1, 2, 8, 3, 2, 2, 2, 5, 1};  
	     int occur[]=new int[arr.length];
	   int  visited=-1;
	   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	     for(int i=0;i<arr.length;i++)
	     {	int c=1;
	    	 for(int j=i+1;j<arr.length;j++)
	    	 {
	    		 if(arr[i]==arr[j])
	    		 {
	    			 c++;
	    			 occur[j]=visited;
	    		 }
	    	 }
	    	 if(occur[i]!=visited)
	    		 occur[i]=c;
	     }
	     for(int i=0;i<occur.length;i++)
	     { 
	    	 if(occur[i]!=visited)
	    		 map.put(arr[i], occur[i]);
	    // System.out.println(arr[i]+"occurs "+fr[i]);
	     }
	     for(Map.Entry k:map.entrySet())
	     {
	    	 System.out.println(k.getKey()+" occurs "+k.getValue()+" times");
	     }
	     int maxvalue = 0;
	     int mkey = 0;
	     for(Integer key: map.keySet()){
	         if(map.get(key) > maxvalue){
	             maxvalue = map.get(key);
	             mkey = key;
	         }
	     }
	     System.out.println(mkey+" is having max value "+maxvalue);
	    	 
	}

}

Input: 1,1, 2, 8, 3, 2, 2, 2, 5, 1
Output: 1 occurs 3 times
	2 occurs 4 times
	3 occurs 1 times
	5 occurs 1 times
	8 occurs 1 times
	2 is having max value 4
