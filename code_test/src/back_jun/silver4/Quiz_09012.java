package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Stack;

// 괄호
// 알고리즘 분류에 스택이 있으니까 한번 풀어보자
// toCharArray 로 비교하니까 좀 더 빠르게 나타나는 듯?
public class Quiz_09012 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
				sb.append(solve(br.readLine())).append("\n");
		}
		System.out.println(sb);
	}
	
	public static String solve(String s) {
		int cnt = 0;
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				cnt++;
			}
			
			else if(cnt == 0) {
				return "NO";
			}
			else {
				cnt--;
			}
		}
		
		if(cnt == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}