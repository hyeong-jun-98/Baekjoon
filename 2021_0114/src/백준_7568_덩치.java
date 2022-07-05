import java.io.*;
import java.util.*;

public class 백준_7568_덩치 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[num][2]; // 2차원 배열 설정

		String[] sp;
		for (int i = 0; i < num; i++) {
			sp = br.readLine().split(" "); // 문자열을 분리해서 sp[0과 1]에 넣어준 후 그거를 정수형으로 2차원 배열에 입력 readLine()은 한 줄 씩 읽기 떄문에 문자열을 분리시켜줘야 한다.
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