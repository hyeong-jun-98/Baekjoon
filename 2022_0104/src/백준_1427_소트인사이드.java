import java.io.*;
import java.util.*;

public class ����_1427_��Ʈ�λ��̵� {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		StringBuilder sb = new StringBuilder(num);

		char[] charArr = num.toCharArray();

		Arrays.sort(charArr);

		for (int i = charArr.length-1; i >= 0; i--) {
			System.out.print(charArr[i]);
		}

	}

}
