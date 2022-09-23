package programmers.level01;

// 약수의 개수와 덧셈
public class Ex26 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int left = 24;
		int right = 27;
		
		System.out.println(s.solution(left, right));
	}
	
	static class Solution {
		public int solution(int left, int right) {
			int answer = 0;
			
			for(int i = left; i <= right; i++) {
				int cnt = 0;
				
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) cnt++;
				}
				
				if(cnt % 2 == 0) answer += i;
				else answer -= i;
			}
			
			return answer;
		}
	}
}
