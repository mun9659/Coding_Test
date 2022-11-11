package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 제로
public class Quiz_08931 {
	public static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		for(int tc = 1; tc <= t; tc++) {
			int k = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < k; i++) {
				int num = Integer.parseInt(br.readLine());
				if(num == 0) {
					stack.pop();
				} else {
					stack.push(num);
				}
			}
			
			int result = 0;
			while(!stack.isEmpty()) {
				result += stack.pop();
			}
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}
