import java.io.*;

public class 백준_5622_다이얼 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0, sum = 0,num = 0;
		String input;
		System.out.print("input : ");
		input = br.readLine();
		for(int i =0; i < input.length(); i++) {
			switch(input.charAt(i)) {
			case 'A' : case 'B': case 'C' : 
				num = 3;
				sum += num;
				break;
                
			case 'D' : case 'E': case 'F' : 
				num = 4;
				sum += num;
				break;
                
			case 'G' : case 'H': case 'I' : 
				num = 5;
				sum += num;; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				num = 6;
				sum += num;
				break;
                
			case 'M' : case 'N': case 'O' : 
				num = 7;
				sum += num;
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' :
				num = 8;
				sum += num;
				break;
                
			case 'T' : case 'U': case 'V' : 
				num = 9;
				sum += num;
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				num = 10;
				sum += num;
				break;
			}
		}		
		System.out.print(sum);
			

}

}
