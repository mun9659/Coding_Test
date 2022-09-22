package programmers.level01;

// 콜라그 추측
public class Ex13 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		long n = 626331;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(long n) {
			int answer = 0;
			
			while(n != 1 && answer <= 500) {
				answer++;
				if(n % 2 == 0) n /= 2;
				else n = n * 3 + 1;
			}
			
			return answer == 501 ? -1 : answer;
		}
	}
}
