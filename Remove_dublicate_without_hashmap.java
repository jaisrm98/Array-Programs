package coding;

import java.util.*;

public class Remove_dublicate_without_hashmap {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 2, 1, 5, 4, 4 };
		int fr[] = new int[arr.length];
		int vis = -1;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = vis;

				}

			}

		}
		for(int i:arr)
		{
			if(i!=-1)
				System.out.print(i+" ");
		}

	}
}

Output: 1 2 4 5 
