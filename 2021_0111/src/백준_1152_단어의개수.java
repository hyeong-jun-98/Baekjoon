import java.io.*;
import java.util.*;

public class 백준_1152_단어의개수 {

	public static void main(String[] args) throws IOException {

		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		String input = bs.readLine();

		StringTokenizer st = new StringTokenizer(input, " ");

		System.out.println(st.countTokens());
	}

}
