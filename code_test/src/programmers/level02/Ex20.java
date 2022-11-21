package programmers.level02;

import java.util.Stack;

// 괄호 회전하기
public class Ex20 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// String str = "[](){}";
		// String str = "}]()[{";
		// String str = "[)(]";
		String str = "[(])";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public int solution(String s) {
			int result = 0;
			char[] s_arr = s.toCharArray();
			
			for(int i = 0; i < s_arr.length; i++) {
				char[] new_arr = new char[s_arr.length];
				for(int j = 0; j < s_arr.length; j++) {
					new_arr[j] = s_arr[(i + j) % s_arr.length];
				}
				
				// System.out.println(new String(new_arr));
				boolean check = false;
				Stack<Character> stack = new Stack<>();
				for(int j = 0; j < new_arr.length; j++) {
					if(new_arr[j] == ']' || new_arr[j] == '}' || new_arr[j] == ')') {
						if(stack.isEmpty()) {
							check = true;
							break;
						}
						
						if(new_arr[j] == ']' && stack.peek() != '[') {
							check = true;
							break;
						}
						
						if(new_arr[j] == '}' && stack.peek() != '{') {
							check = true;
							break;
						}
						
						if(new_arr[j] == ')' && stack.peek() != '(') {
							check = true;
							break;
						}
						stack.pop();
					} else {
						stack.add(new_arr[j]);
					}
				}
				
				if(!check && stack.isEmpty()) result++; // stack이 비어있을 경우가 있나? 한번 찾아보도록 하자
			}
			
			return result;
		}
	}
}
