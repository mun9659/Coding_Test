package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 막대기
public class Quiz_01094 {
	static int O = 64, X;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		X = Integer.parseInt(br.readLine());
		
		System.out.println(slice());
		
		br.close();
	}
	
	private static int slice() {
		int result = 0;
		while(true) {
			if(O > X) {
				O /= 2;
			} else if(O < X) {
				X -= O;
				result++;
			} else {
				result++;
				break;
			}
		}
		
		return result;
	}
}

	
