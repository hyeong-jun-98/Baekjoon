import java.io.*;
import java.util.Arrays;

public class ����_2750_��_�����ϱ� {

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
