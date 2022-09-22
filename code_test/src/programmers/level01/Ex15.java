package programmers.level01;

// 서울에서 김서방 찾기
public class Ex15 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String[] seoul = {"Jane", "Kim"};
		
		System.out.println(s.solution(seoul));
	}
	
	static class Solution {
		public String solution(String[] seoul) {
			String answer = "김서방은 ";
			
			for(int i = 0; i < seoul.length; i++) {
				if(seoul[i].equals("Kim")) {
					answer += i;
				}
			}
			
			return answer + "에 있다";
		}
	}
}
