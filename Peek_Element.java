package coding;

public class Peek_Element {

	public static void main(String[] args) {
		int arr[]= {5, 10, 20, 15};
		if(arr.length==1)
			System.out.println("Peek element index is "+0);
		if(arr[0]>arr[1])
			System.out.println("Peek element index is "+0);
		if(arr[arr.length-1]>arr[arr.length-2])
			System.out.println("Peek element index is " +(arr.length-1));
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1]&& arr[i]>arr[i+1])
				System.out.println("Peek element index is "+i);
		}

	}

}
