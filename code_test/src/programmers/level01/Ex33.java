package programmers.level01;

// 3진법 뒤집기
public class Ex33 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 125;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			int answer = 0;
			String chk = "";
			
			while(n != 0) {
				chk += n % 3;
				n = n / 3;
			}
			
			int pow = 0;
			for(int i = chk.length() - 1; i >= 0 ; i--) {
				answer += Integer.parseInt(chk.substring(i, i+1)) * Math.pow(3, pow++);
			}
			
			return answer;
		}
	}
}
