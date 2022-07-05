import java.io.*;
import java.util.Arrays;

public class 백준_2750_수_정렬하기 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
