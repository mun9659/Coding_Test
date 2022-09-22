package programmers.level01;

// 나머지가 1이 되는 수 찾기
public class Ex12 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 12;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			int answer = 1;
			
			while(answer < n) {
				if(n % answer == 1) {
					break;
				} else {
					answer++;
				}
			}
			
			return answer;
		}
	}
}
