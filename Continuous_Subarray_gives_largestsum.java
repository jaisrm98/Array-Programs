package Practice;
import java.util.*;
public class Continuous_Sub_Array_LargestSum {

	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=0,result=arr[0];
		for(int i:arr) {
			if(i>=sum+i)
				sum=i;
			else
				sum=sum+i;
			
			result=Math.max(result,sum);
		}
		System.out.println(result);

	}

}



input: -2,1,-3,4,-1,2,1,-5,4
Output: 6               // 4,-1,2,1
