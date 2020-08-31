package coding;

public class Remove_given_elemnt_from_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,5,3,5,4};
		int val=5;
		int i=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]!=val)
			{
				arr[i]=arr[j];
				System.out.print(arr[i]+" ");
				i++;
			}
		}
		
		System.out.println("\nlength of new array "+i);
		
		}
	}


