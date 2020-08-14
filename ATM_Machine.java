package coding;
import java.util.*;
public class ATM_Machine {

	public static void main(String[] args) {
		int amount;
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		int i=0,number,count=0;
		int coins[]= {2000,500,100,50,20,10,5,2,1};
		if(amount<coins[8])
		{
			System.out.println("-1");
		}
		while(amount>0)
		{
			number=amount/coins[i];
			amount=amount%coins[i];
			if(number>0)
			System.out.println(number+" note of "+coins[i]);
			count+=number;
			i++;
		}
		System.out.println("Total notes "+count);
	}

}
