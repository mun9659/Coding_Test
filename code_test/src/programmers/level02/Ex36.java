package programmers.level02;

// [3차] n진수 게임
public class Ex36 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		// int n = 2, t = 4, m = 2, p = 1;
		// int n = 16, t = 16, m = 2, p = 1;
		int n = 16, t = 16, m = 2, p = 2;
		
		System.out.println(sol.solution(n, t, m, p));
	}
	
	public static class Solution {
		 public String solution(int n, int t, int m, int p) {
			 // n진법, 미리 구할 숫자의 갯수 t, 게임의 참가하는 인원 m, 튜브의 순서 p
			 String answer = "";
			 
			 String str = "";
			 int num = 0;
			 while(str.length() < t * m) {
				 str += Integer.toString(num++, n);
			 }
			 
			for(int i = 0; i < str.length(); i++) {
				if(i % m == p - 1 && answer.length() < t) {
					answer += str.toUpperCase().charAt(i);
				}
			}
			 
			 return answer;
	    }
	}
}
