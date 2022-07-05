import java.util.*;
public class 백준_2739_구구단 {

	public static void main(String[] args) {
		
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 :");
		N = sc.nextInt();
		
		
		for(int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + N * i );
		}
	}

}
