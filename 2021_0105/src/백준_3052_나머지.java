import java.util.*;

public class 백준_3052_나머지 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			hs.add(sc.nextInt() % 42);
		}
		System.out.println(hs.size());
	}

}
