package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Max_Frequency_InArray {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,3,3};
		HashMap<Integer, Integer>count=new HashMap<Integer,Integer>();
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
				count.put(arr[i], 1);
			}
			else
			{
				count.put(arr[i],count.get(arr[i])+1);
			}
		}
		for (Map.Entry entry : count.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", frequency = " + entry.getValue());
		int max =0;
		int key=0;
		for(int k:count.keySet())
		{
			if(count.get(k)>max) {
				max=count.get(k);
						key=k;
		}
	}
		System.out.println(key+" is having max value "+ max);
	}

}

Output: Key = 1, frequency = 2
	Key = 2, frequency = 1
	Key = 3, frequency = 3
	3 is having max value 3
