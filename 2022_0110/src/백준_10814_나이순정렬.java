import java.io.*;
import java.util.*;

public class 백준_10814_나이순정렬 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		String[][] arr = new String[num][num];

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}

		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] s1, String[] s2) {

				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);

			}
		});
		for (int i = 0; i < num; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}
		System.out.println(sb);

	}

}
