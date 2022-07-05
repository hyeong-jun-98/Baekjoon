import java.util.*;

public class 백준_2775_부녀회장이될테야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int k = 0, n = 1;
		int[][] arr = new int[15][15];

		for (int i = 0; i < 15; i++) {
			arr[0][i] = i;
			arr[i][1] = 1;

		}
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];

			}
		}
		System.out.print("testcase : ");
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			k = sc.nextInt();
			n = sc.nextInt();
			System.out.println(arr[k][n]);
		}

	}

}
