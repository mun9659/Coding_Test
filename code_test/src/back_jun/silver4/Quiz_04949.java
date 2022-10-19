package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 균형잡힌 세상
// 스택
public class Quiz_04949 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		while((str = br.readLine()) != null) {
			if(str.equals(".")) break;
			
			Stack<Character> stack = new Stack<>();
			char[] char_arr = str.toCharArray();
			boolean chk = false;
			for(char val : char_arr) {
				if(val == '(') stack.push(val);
				else if(val == ')') {
					if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
					else {
						chk = true;
						break;
					}
				}
				if(val == '[') stack.push(val);
				else if(val == ']') {
					if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
					else {
						chk = true;
						break;
					}
				}
			}
			if(stack.isEmpty() && !chk) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		System.out.println(sb);
	}
}