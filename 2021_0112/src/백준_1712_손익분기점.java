import java.util.*;

public class ����_1712_���ͺб��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c <= b) {
			System.out.println("-1");
		}
		else {
			System.out.println(a / (c-b)+1);
		}
	}

}
