
public class ����_2562_�ִ� {

	public static void main(String[] args) {
		int [] arr = {3,29,38,12,57,74,40,85,61};
		int max = arr[0];
		int count = 0;
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				count = i + 1;
			} 
		}
		System.out.println(max + " "+ count );
		
		
		
	}

}
