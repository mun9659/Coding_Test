package programmers.level01;

// 두 정수 사이의 합
public class Ex14 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int a = 1000000;
		int b = 3000000;
		
		System.out.println(s.solution(a, b));
	}
	
	static class Solution {
		public long solution(int a, int b) {
			long answer = 0;
			
			for(int i = (a < b ? a : b); i <= (a < b ? b : a); i++) {
				answer += i;
			}
			
			return answer;
		}
	}
}
