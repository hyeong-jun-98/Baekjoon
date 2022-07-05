import java.util.*;

public class 백준_2577_숫자의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;
		int sum = a * b * c;
		String n = Integer.toString(sum);

		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < n.length(); j++) {
				if ((n.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(i + " : " + count);
		}

	}

}
