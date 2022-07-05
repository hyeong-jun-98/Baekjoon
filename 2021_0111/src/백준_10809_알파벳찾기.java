import java.util.*;

public class 백준_10809_알파벳찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count;
		String input;
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			count = sc.nextInt();
			input = sc.next();

			for (int j = 0; j < input.length(); j++) {

				for (int k = 0; k < count; k++) {
					System.out.print(input.charAt(j));
				}
			
			}
			System.out.println();

		}

	}

}
