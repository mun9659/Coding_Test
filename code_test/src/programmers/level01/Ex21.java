package programmers.level01;


// 수박수박수박수박수박수?
public class Ex21 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 5001;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public String solution(int n) {
			String answer = "";
			
			for(int i = 1; i <= n; i++) {
				if(i % 2 != 0) answer += "수";
				else answer += "박";
			}
			
			return answer;
		}
	}
}
