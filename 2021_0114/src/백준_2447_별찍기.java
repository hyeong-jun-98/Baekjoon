import java.util.*;
// Pass
public class 백준_2447_별찍기 {

	public static void star(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i % 3 == 1 && j % 3 == 1) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		star(num);

	}

}
