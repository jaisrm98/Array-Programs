
public class Insert_element_at_perfect_Position {

	 public  static int searchInsert(int[] nums, int target) {
	        if(nums==null || nums.length==0)
	        return 0;
	    int low=0;
	    int high=nums.length-1;
	    int mid;
	    while(low<=high){
	        mid = (low+high)/2;
	        if(nums[mid]<target) 
	        	{
	        	low = mid+1;
	        	}
	        	
	        else if(nums[mid]>target) 
	        {
	        	high = mid-1;
	        }
	        else return mid;
	    }
	    return high+1; 
	    }
	public static void main(String[] args) {
		int nums[]= {1,3,5,6};
		int target=4;
		System.out.println(searchInsert(nums,target));
	}

}
