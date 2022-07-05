import java.io.*;
public class 백준_2908_상수 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer a = new StringBuffer(bs.readLine());
		StringBuffer b = new StringBuffer(bs.readLine());
		
		int r_a = Integer.parseInt(a.reverse().toString());
		int r_b = Integer.parseInt(b.reverse().toString());
		
		if(r_a < r_b) {
			System.out.println(r_b);
		} else {
			System.out.println(r_a);
		}
		
		 
		
		

	}

}
