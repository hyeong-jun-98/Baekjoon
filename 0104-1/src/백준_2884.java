import java.util.*;
import java.math.*;

public class น้มุ_2884 {

	public static void main(String[] args) {

		int H, M;
		Scanner sc = new Scanner(System.in);
		System.out.print("H : ");
		H = sc.nextInt();
		System.out.print("M : ");
		M = sc.nextInt();

		if (M < 45) {
			H--;
			M = 60 - (45 - M);

			if (H < 0) {
				H = 23;
			}

			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}

}
