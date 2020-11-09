package coding;

import java.util.*;

public class Missing_Number {

	public static int missingNumber(int[] arr) {
		int k = 0;
		if (arr.length == 1) {
			if (arr[0] == 1)
				return 0;
			else
				return 1;

		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i) {
				k = i;
				break;
			} else

				k = arr.length;
		}
		return k;
	}

	public static void main(String[] args) {
		int arr[] = {0,2};
		Arrays.sort(arr);
		int output = missingNumber(arr);
		System.out.println(output);
	}

}
