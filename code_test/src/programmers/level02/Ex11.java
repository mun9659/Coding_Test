package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// 짝지어 제거하기(스택 사용하라는데 내가 자바 스택 함수 잘 모름, 복기해야함)
// 문자열의 길이 : 1,000,000이하의 자연수
public class Ex11 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String str = "abccba";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public int solution(String s) {
			Stack<Character> stack = new Stack<>();
			
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				
				if(!stack.isEmpty() && stack.peek() == ch) stack.pop();
				else stack.push(ch);
			}
			
			return stack.isEmpty() ? 1 : 0;
		}
	}
}

/*
 * 1. 매우 긴 시간 사용, 한개 실패, 효율성 ALL 시간초과
 	int answer = 0;
			ArrayList<String> arr = new ArrayList<>();
			
			for(int i = 0; i < s.length(); i++) {
				arr.add(s.substring(i, i+1));
			}
			
			int cnt = 1;
			while(true) {
				
				System.out.println(arr);
				
				if(arr.get(cnt).equals(arr.get(cnt-1))) {
					System.out.println("cnt : " + cnt);
					arr.remove(cnt - 1);
					arr.remove(cnt - 1);
					cnt = 1;
				} else {
					cnt++;
				}
				
				if(arr.size() == 0) {
					answer = 1;
					break;
				} 
				
				if(cnt == arr.size()) break;
				
			}
			
			return answer; 
*/