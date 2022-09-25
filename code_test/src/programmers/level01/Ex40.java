package programmers.level01;

// 숫자 문자열과 영단어
public class Ex40 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String str = "seven2three4sixfive";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public int solution(String s) {
			String answer = "";
			String[] alpha_num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
			int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			StringBuffer sb = new StringBuffer();
			
			sb.append(s);
			while(sb.length() != 0) {
				for(int i = 0; i < alpha_num.length; i++) {
					if(sb.indexOf(alpha_num[i]) == 0) {
						answer += i;
						sb.delete(sb.indexOf(alpha_num[i]), sb.indexOf(alpha_num[i]) + alpha_num[i].length());
						break;
					}
					
					if(sb.indexOf(String.valueOf(num[i])) == 0) {
						answer += i;
						sb.delete(sb.indexOf(String.valueOf(num[i])), sb.indexOf(String.valueOf(num[i])) + 1);
						break;
					}
				}
			}
			
			return Integer.parseInt(answer);
		}
	}
}
