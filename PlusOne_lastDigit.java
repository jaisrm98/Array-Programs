package coding;

public class PlusOne_lastDigit {
	static  public int[] plusOne(int[] arr) {
	       int len=arr.length;
	        int arr1[]=new int[len+1];
	        for(int i=len-1;i>=0;i--)
	        {
	            if(arr[i]<9){
	                arr[i]++;
	            return arr;}
	            arr[i]=0;
	        }
	       
	        
	         arr1[0]=1;
	            return arr1;
	        
	    }
	public static void main(String[] args) {
		int arr[]= {1,9,9};
		int len=arr.length;
		 int arr1[]=new int[len+1];
		arr1=plusOne(arr);
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");

	}

}

output: 2 0 0 
