import java.util.*;
import java.io.*;

public class ����_8958_OX���� {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		String ox;
		System.out.print("num : ");
		num = sc.nextInt();
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			ox = br.readLine();
			arr[i] = ox;
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0, count = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					
					count++;

				} else {
					
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
		}

	}

}
