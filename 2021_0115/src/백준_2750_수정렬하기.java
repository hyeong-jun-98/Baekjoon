import java.io.*;
import java.util.Arrays;

public class 백준_2750_수정렬하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp, result;
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(br.readLine());

		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				

				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
