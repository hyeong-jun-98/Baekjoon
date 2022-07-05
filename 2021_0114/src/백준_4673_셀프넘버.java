import java.io.*;
import java.util.*;
// pass
public class 백준_4673_셀프넘버 {
	public static int sum = 0;

	public static int selfNum(int n) {

		StringBuilder sb = new StringBuilder();
		int sum = n;

		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
		
	}

	public static void main(String[] args) throws IOException {

		int [] arr = new int [10000];
		boolean [] bl = new boolean [10000];
		for (int i = 0; i < 10000; i++) {

			arr[i] = selfNum(i);

		}
		for (int i = 0; i < 10000; i++) {
			
		}

	}

}
