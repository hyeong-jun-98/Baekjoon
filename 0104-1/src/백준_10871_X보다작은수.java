import java.io.*;
import java.util.*;

public class ����_10871_X���������� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		// ���⼭ �� �ܾ� ������ �Է��ϹǷ� �� �� �� �ҷ��;���
		
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
