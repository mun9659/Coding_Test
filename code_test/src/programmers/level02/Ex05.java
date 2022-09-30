package programmers.level02;

// 올바른 괄호
public class Ex05 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String str = "()()";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public boolean solution(String s) {
			boolean answer = true;
			int cnt = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(') cnt++;
				else if(s.charAt(i) == ')') cnt--;
				
				// 이미 )가 들어가있어서 음수 상태가 된다면 이미 깨져버린 상태
				if(cnt < 0) {
					answer = false;
					break;
				}
			}
			
			// ( 가 과다하게 있다면 깨져버린 상태
			if(cnt != 0) answer = false;
			
			return answer;
		}
	}
}
