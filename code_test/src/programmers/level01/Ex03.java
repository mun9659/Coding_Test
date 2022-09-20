package programmers.level01;

// 약수의 합
public class Ex03 {
	public static void main(String[] args) throws Exception {
		
		int n = 5;
		Solution s = new Solution();
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			int answer = 0;
			
			for(int i = 1; i <= n; i++) {
	            if(n % i == 0) {
	                answer += i;
	            }
	        }
			
			return answer;
		}
	}
}
