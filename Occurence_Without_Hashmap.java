package coding;
import java.util.*;

public class Occurence_Without_Hashmap {

	public static void main(String[] args) {
		int k=0;
		int arr[] = { 1, 2, 4, 2, 1, 5, 4, 4 };
		int fr[] = new int[arr.length];
		int vis = -1; int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			int c = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = vis;
					c++;
				}
				if (arr[i] != vis) {
					fr[i] = c;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != vis)
				System.out.println(arr[i] + " " + fr[i]);
		}
		for (int i = 0; i < arr.length; i++)
		{ 
			if(fr[i]>max) {
				
				max=fr[i];
				k=arr[i];
				}
			
		}
		System.out.println(k+ " is haivng  max frequency "+max);
	}

}
