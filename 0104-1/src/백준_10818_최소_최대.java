import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_10818_최소_최대 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				 min = arr[i];
				
			}

		}
		System.out.println(min + " " + max);
		

	}

}
