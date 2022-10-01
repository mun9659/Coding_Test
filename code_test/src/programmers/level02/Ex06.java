package programmers.level02;

// 숫자의 표현
public class Ex06 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 15;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			int answer = 0;
			
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				sum += i;
				if(sum == n)  {
					answer++;
					break;
				}
				for(int j = i+1; j <= n; j++) {
					sum += j;
					if(sum > n) {
						sum = 0;
						break;
					} else if(sum == n) {
						answer++;
						sum = 0;
						break;
					}
				}
			}
			
			return answer;
		}
	}
}
