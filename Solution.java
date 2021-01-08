package my_programs;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            
    	int temp=0;
    	Scanner sc=new Scanner(System.in);
    	int no=sc.nextInt();
    
    	
    	for(int i=2;i<=no-1;i++)
    	{	
    		if(no%i==0) {  			
    			temp=temp+1;
    		}
    	}
    		if(temp==0)
    		{
    			System.out.println(" prime");
    		}
    		else
    		{
    			System.out.println("not prime no");
    		}
    	}
    }
    		
    		
    		
    	
    	
		
    	
    
    
    
