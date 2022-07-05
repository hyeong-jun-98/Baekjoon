import java.util.*;

public class น้มุ_11021_วี_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
		int N = sc.nextInt();
		int a, b;
		int[] arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a + b;
		}
		for(int i = 1; i <= N; i++) {
			System.out.println("Case #" + i + ": "+ arr[i]);
		}

	}

}
