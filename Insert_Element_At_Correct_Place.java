package coding;

public class Insert_Element_At_Correct_Place {

	static public int nums(int [] nums,int target)
	{
		 int i;
	        for( i=0;i<nums.length;i++)
	        {
	            if(target==nums[i])
	                return i;
	            else if(nums[i]>target)
	                return i;
	        }
	        return i;

	}
	
	public static void main(String[] args) 
	{
		
		int nums[]= {1,3,5,6};
				int target=2;
				System.out.println(nums(nums,target));
				
		

	}

}
Input: 1 3 5 6
	target=2;
Output: 1
