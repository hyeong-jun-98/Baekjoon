import java.util.*;

public class ����_10950_ {

	public static void main(String[] args) {

		int N = 0, a, b, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� :");
		N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a + b;

		}
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}

	}

}
