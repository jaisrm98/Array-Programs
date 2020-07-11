package coding;
import java.util.*;
public class Sum_Of_Array {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			sum=sum+array[i];
		}
System.out.println(sum);
	}

}
