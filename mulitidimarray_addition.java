package sorting;
import java.util.Scanner;
public class mulitidimarray_addition {

	public static void main(String[] args) {
		
int n,m;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
int arr1[][]=new int [n][m];
int arr2[][]=new int [n][m];
int sum[][]=new int[n][m];

for(int i=0;i<n;i++)

	for(int j=0;j<m;j++)
	
		arr1[i][j]=sc.nextInt();
		
	

for(int i=0;i<n;i++)

	for(int j=0;j<m;j++)
	
		
		arr2[i][j]=sc.nextInt();
	

for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		
	sum[i][j]=arr1[i][j]+arr2[i][j]	;
	
		
	}
}
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {

System.out.print(sum[i][j]+"\t");

	}
	System.out.println();
}

	
}
}