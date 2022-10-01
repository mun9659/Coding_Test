package programmers.level02;

// 다음 큰 숫자
public class Ex08 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 15;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			int answer = n+1;
			String num = Integer.toString(n, 2);
			int cnt = 0, chk = 0;
			
			for(int i = 0; i < num.length(); i++) {
				if(num.charAt(i) == '1') chk++;
			}
			
			while(true) {
				String num_chk = Integer.toString(answer, 2);
				for(int i = 0; i < num_chk.length(); i++) {
					if(num_chk.charAt(i) == '1') cnt++;
				}
				if(cnt != chk)  {
					cnt = 0;
					answer++;
				}
				else break;
			}
			
			return answer;
		}
	}
}
