package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 뒤집힌 덧셈
public class Quiz_01357 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int result = reverse(X) + reverse(Y);
		
		System.out.println(reverse(result));
	}
	
	private static int reverse(int n) {
		String[] n_arr = String.valueOf(n).split("");
		int result = 0;
		
		for(int i = 0; i < n_arr.length; i++) {
			result += Integer.parseInt(n_arr[i]) * Math.pow(10, i);
		}
		
		return result;
	}
}
