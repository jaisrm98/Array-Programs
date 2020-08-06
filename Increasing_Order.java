package coding;
import java.util.*;
public class Increasing_Order {

	public static void main(String[] args) {
	

Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  
    int sum=0;
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
    for(int i = 0; i < n; i++)
    {   int flag=1;
        for(int j=i+1;j<n;j++)
        {
            if(array[i]<array[j])
                flag=0;
            break;
        }
        if(flag==1)
        sum=sum+array[i];
    }
    System.out.println(sum);
    
    }
}

Input:  5
	5 4 3 1 2
	
Output: 14
	
	Explanation
	
	5 is greater than 4 so add 5 to sum..4 is greater than 3 so add to sum..3 is greater than 1 so add to sum..1 is smaller than 2 so leave it..always add last element to sum..
	sum=5+4+3+2= 14
