package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 단어 뒤집기2
// 스택을 쓰는걸 생각하지 못했다. 다시 복기해보자
public class Quiz_17413 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		boolean check = false;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '<') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				check = true;
			}
			
			else if(s.charAt(i) == '>') {
				check = false;
				sb.append(s.charAt(i));
				continue;
			}
			
			if(check) {
				sb.append(s.charAt(i));
			}
			else {
				if(s.charAt(i) == ' ') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
					continue;
				} else {
					stack.push(s.charAt(i));
				}
			}
			
			if(i == s.length() - 1) {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
			}
		}
		System.out.println(sb);
	}
}
