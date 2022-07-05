import java.io.*;
import java.util.*;

public class 백준_10871_X보다작은수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		// 여기서 또 단어 단위로 입력하므로 한 번 더 불러와야함
		
		int N;
		for (int i = 0; i < num; i++) {

			N = Integer.parseInt(st.nextToken());
			
			if (N < count) {
				sb.append(N + " ");
			}
		}

		System.out.print(sb);
	}

}
