import java.io.*;
import java.util.*;

public class ����_7568_��ġ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[num][2]; // 2���� �迭 ����

		String[] sp;
		for (int i = 0; i < num; i++) {
			sp = br.readLine().split(" "); // ���ڿ��� �и��ؼ� sp[0�� 1]�� �־��� �� �װŸ� ���������� 2���� �迭�� �Է� readLine()�� �� �� �� �б� ������ ���ڿ��� �и�������� �Ѵ�.
			arr[i][0] = Integer.parseInt(sp[0]);
			arr[i][1] = Integer.parseInt(sp[1]);

		}
		StringBuilder bs = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			int rank = 1;
			for(int j = 0; j < num; j++) {
				if(i == j) {
					continue;
				}
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			bs.append(rank + " ");
			
		}
		System.out.print(bs);

	}
}