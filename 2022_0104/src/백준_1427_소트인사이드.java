import java.io.*;
import java.util.*;

public class 백준_1427_소트인사이드 {

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
