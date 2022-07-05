import java.io.*;
import java.util.*;

public class 백준_11720_숫자의합 {

	public static void main(String[] args) throws IOException {

		
		Scanner sc = new Scanner(System.in);
		int count, sum = 0;
		System.out.print("num : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		String pnum;
		String input = sc.next();
		
		for(int i = 0; i < num; i++) {
			arr[i] = input.charAt(i) - '0';
			sum += arr[i];
			
		}
		System.out.println(sum);
	}

}
