// 매개변수가 배열인 메소드
public class 백준_15596_정수N개의합 {
	class Test {
		long result = 0;

		long sum(int[] a) {
			for (int i = 0; i < a.length; i++) {
				result += i;
			}
			return result;
		}
	}

	public static void main(String[] args) {

	}

}
