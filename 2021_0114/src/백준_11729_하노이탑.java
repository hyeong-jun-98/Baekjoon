import java.util.*;

// pass
public class 백준_11729_하노이탑 {

	public static int count = 0;
	public static StringBuilder st = new StringBuilder();

	public static void hanoi(int n, int from, int mid, int to) {

		count++;
		if (n == 1) {
			st.append(from + " " + to + "\n");
		} else {
			hanoi(n - 1, from, to, mid);
			st.append(from + " " + to + "\n");
			hanoi(n - 1, mid, from, to);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		hanoi(num, 1, 2, 3);
		System.out.println(count);
		System.out.println(st);
	}

}
