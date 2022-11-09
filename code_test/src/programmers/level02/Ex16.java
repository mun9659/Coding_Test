package programmers.level02;

// 예상 대진표
public class Ex16 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		int n = 16;
		int a = 4;
		int b = 16;
		
		System.out.println(s.solution(n, a, b));
	}
	
	static class Solution {
		public int solution(int n, int a, int b) {
			int answer = 0;
			
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			
			while(min != max) {
				if(min % 2 != 0) min += 1;
				if(max % 2 != 0) max += 1;
				
				if(min == max) {
					answer++;
					break;
				}
				min /= 2;
				max /= 2;
				answer++;
			}
			
			
			return answer;
		}
	}
}