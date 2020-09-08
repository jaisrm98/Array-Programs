package coding;

public class Rotate_array_K_steps {

	public static void main(String[] args) {

		int []arr = {1,2,3,4,5,6,7};
		int k=3;
		  int j=0;
	        
          for(int i=1;i<=k;i++)
     {
         int first=arr[arr.length-1];
         for( j=arr.length-1;j>0;j--)
         {
             arr[j]=arr[j-1];
         }
         arr[j]=first;
     }
	       for(int i=0;i<arr.length;i++)
	        	System.out.print(arr[i]+" ");
	}

}
