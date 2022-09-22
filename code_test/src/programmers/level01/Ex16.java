package programmers.level01;

// 핸드폰 번호 가리기
public class Ex16 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String phone_number = "027778888";
		
		System.out.println(s.solution(phone_number));
	}
	
	static class Solution {
		public String solution(String phone_number) {
			String answer = "";
			String[] phone = phone_number.split("");
			
			for(int i = 0; i < phone.length - 4; i++) {
				phone[i] = "*";
			}
			
			answer = String.join("", phone);
			
			return answer;
		}
	}
}
