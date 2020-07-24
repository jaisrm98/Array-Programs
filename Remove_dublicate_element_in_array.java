package coding;
import java.util.*;
public class Remove_dublicate_element_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		Integer arr[]=new Integer[k];
		
		for(int i=0;i<k;i++)
			arr[i]=sc.nextInt();
	HashSet<Integer> set=new HashSet<Integer>(Arrays.asList(arr));
	int n=set.size();
	arr=set.toArray(arr);
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}

}
