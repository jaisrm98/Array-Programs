package coding;

public class Continuous_Subarray_gives_largestsum {

	public static void main(String[] args) {
		int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;int result=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
                sum=nums[i];
            
            else
            {  
                if(nums[i]>=(sum+nums[i]))
                {
                    sum=nums[i];
                }
               
                else {
                	sum=sum+nums[i];
                }
               
                result=Math.max(result, sum);
                
            }
            
            }
        System.out.println(result);
	}

}

input: -2,1,-3,4,-1,2,1,-5,4
Output: 6               // 4,-1,2,1
