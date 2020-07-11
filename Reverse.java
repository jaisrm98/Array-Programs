package coding;
import java.util.*;
public class Reverse {
	
	static int reverse(int a)
	{
		int s=0,r;
		while(a!=0)
		{
			r=a%10;
			s=s*10+r;
			a=a/10;
		}
		return s;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int output=reverse(n);
		System.out.println(output);

	}

}
