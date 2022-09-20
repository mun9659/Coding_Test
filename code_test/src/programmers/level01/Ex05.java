package programmers.level01;

// 자릿수 더하기
public class Ex05 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int N = 100900642;
		
		System.out.println(s.solution(N));
	}
	
	static class Solution {
		public int solution(long n) {
			int answer = 0;
			
			String num = n + "";
			String[] num_arr = num.split("");
			
			for(int i = 0; i < num_arr.length; i++) {
				answer += Integer.parseInt(num_arr[i]);
			}
			
			return answer;
		}
	}
}
