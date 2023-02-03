package Code;

public class peak_element {

	public static void main(String[] args) {
		int arr[]= {20,1};
		if(arr.length==1)
			System.out.println("Peek element index is "+0);
		if(arr.length==2 && arr[0]>arr[1])
			System.out.println("Peek element index is "+0);
		if(arr.length==2 && arr[arr.length-1]>arr[0])
			System.out.println("Peek element index is " +(arr.length-1));
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1]&& arr[i]>arr[i+1])
				System.out.println("Peek element index is "+i);
		}
	}

}


Output: Peek element index is 2
