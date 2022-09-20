package programmers.level01;

// 문자열을 정수로 바꾸기
public class Ex10 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String n = "-1234";
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(String s) {
			int answer = Integer.parseInt(s);
			
			return answer;
		}
	}
}
