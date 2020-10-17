package coding;

import java.util.ArrayList;
import java.util.Arrays;

public class Comman_elements_in_Twoarrays {

	public static void main(String[] args) {
		Integer arr[]= {1,2,3};
		Integer arr1[]= {2,5};
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(arr));
		for(int i=0;i<arr1.length;i++)
		{
			if(list.contains(arr1[i]))
				System.out.println(arr1[i]);
		}

	}

}
