package coding;
import java.util.*;
public class Concatenate_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Integer arr1[]= {1,2,3};
		Integer arr2[]= {4,5,6};
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.addAll(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		int s=list.size();
		arr1=list.toArray(arr1);
		for(int i=0;i<s;i++)
			System.out.println(arr1[i]);
		//for(Integer k:list)
		//System.out.print(k+" ");
	}

}
