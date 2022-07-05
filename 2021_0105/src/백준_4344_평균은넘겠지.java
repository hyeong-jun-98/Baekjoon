import java.util.*;

public class 백준_4344_평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("num : ");
		num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			int score = 0, sum = 0;
			double avg = 1, student = 1;
			int count = 0;
			arr[i] = sc.nextInt();

			for (int j = 0; j < arr[i]; j++) {
				score = sc.nextInt();
				sum += score;
				avg = sum / arr[i];
				if (score > avg) {
					count++;
				}
				student = (count / num) * 100;

			}
			System.out.println(avg + " "+ student);

		}

	}

}
