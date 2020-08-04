package coding;
import java.util.*;
public class Occurence_of_element {

	public static void main(String[] args) {
		 int [] arr = new int [] {1,1, 2, 8, 3, 2, 2, 2, 5, 1};  
	     int fr[]=new int[arr.length];
	   int  visited=-1;
	   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	     for(int i=0;i<arr.length;i++)
	     {	int c=1;
	    	 for(int j=i+1;j<arr.length;j++)
	    	 {
	    		 if(arr[i]==arr[j])
	    		 {
	    			 c++;
	    			 fr[j]=visited;
	    		 }
	    	 }
	    	 if(fr[i]!=visited)
	    		 fr[i]=c;
	     }
	     for(int i=0;i<fr.length;i++)
	     { 
	    	 if(fr[i]!=visited)
	    		 map.put(arr[i], fr[i]);
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
