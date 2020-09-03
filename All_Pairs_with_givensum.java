package coding;

public class All_Pairs_with_givensum {



		public static void main(String[] args) {
			int target=9;
			int A[]={6,7,2,3};
		
			for(int i = 0; i < A.length; i++)
	        {
	            for(int j = i + 1; j < A.length; j++)
	            {
	                if(A[i] + A[j] == target)
	                {
	                 System.out.println("("+A[i]+", "+A[j]+")");
	                }
	            }
		}


	}
	}
}

Output: (6, 3)
        (7, 2)
