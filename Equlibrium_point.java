package coding;

public class Equlibrium_point {

	public static int equlibrium(int arr[], int n) {
		int sum = 0;
		int leftsum = 0;

		if (n == 2)
			return -1;
		else {
			for (int i = 0; i < n; i++) {
				sum += arr[i];
			}
			for (int i = 0; i < n; i++) {
				sum -= arr[i];
				if (leftsum == sum) {
					return arr[i];
				}

				leftsum += arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int l = arr.length;
		int output = equlibrium(arr, l);
		System.out.println(output);

	}

}
