package coding;
import java.util.*;
public class Remove_given_element_in_array {

	int a;
	Remove_given_element_in_array(int a)
	{
		this.a=a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Remove_given_element_in_array> list=new ArrayList<Remove_given_element_in_array>();
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			Remove_given_element_in_array s1=new Remove_given_element_in_array(k);
			list.add(s1);
			
		}
		System.out.println("enter value to ve removed");
		int r=sc.nextInt();
		list.remove(r);
		for(Remove_given_element_in_array z:list)
			System.out.print(z.a+" ");
		
		
			}

}
