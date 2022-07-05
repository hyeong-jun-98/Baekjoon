import java.util.*;

public class πÈ¡ÿ_2798_∫Ì∑¢¿Ë {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		int sum = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = i + 2; k < arr.length; k++) {

					sum = arr[i] + arr[j] + arr[k];

					if (result < sum && sum <= m) {
						result = sum;
					}

				}
			}

		}
		System.out.println(result);

	}
}
