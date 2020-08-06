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