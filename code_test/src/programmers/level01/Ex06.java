package programmers.level01;

import java.util.Arrays;

// 자연수 뒤집어서 배열로 만들기
public class Ex06 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 13579;
		
		System.out.println(Arrays.toString(s.solution(n)));
	}
	
	static class Solution {
		public int[] solution(long n) {
			String num = String.valueOf(n); // n + ""와 동일?
			String[] num_arr = num.split("");
			
			int[] answer = new int[num_arr.length];
			
			for(int i = 0; i < num_arr.length; i++) {
				answer[i] = Integer.parseInt(num_arr[num_arr.length - i - 1]);
			}
			
			return answer;
		}
	}
}
