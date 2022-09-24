package programmers.level01;

// 시저 암호
public class Ex35 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String str = "a B z";
		int n = 4;
		
		System.out.println(s.solution(str, n));
	}
	
	static class Solution {
		public String solution(String s, int n) {
			String answer = "";
			
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					if(s.charAt(i) + n > 90) answer += (char)(s.charAt(i) - 26 + n);
					else answer += (char)(s.charAt(i) + n);
				} else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					if(s.charAt(i) + n > 122) answer += (char)(s.charAt(i) - 26 + n);
					else answer += (char)(s.charAt(i) + n);
				} else answer += s.charAt(i);
			}
			
			return answer;
		}
	}
}
