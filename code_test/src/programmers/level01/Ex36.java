package programmers.level01;

import java.util.Arrays;

// 비밀지도
public class Ex36 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int n = 6;
		int[] arr1 = {46, 33, 33, 22, 31, 50};
		int[] arr2 = {27, 56, 19, 14, 14, 10};
		
		System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));
	}
	
	static class Solution {
		public String[] solution(int n, int[] arr1, int[] arr2) {
			String[] answer = new String[n];
			
			for(int i = 0; i < n; i++) {
				String chk = "";
				String result = "";
				int chk1 = arr1[i];
				int chk2 = arr2[i];
				int cnt = 0;
				
				// 2진법 변환
				while(cnt != n) {
					if(chk1 % 2 == 1 || chk2 % 2 == 1) chk += "#";
					else chk += " ";
					chk1 /= 2;
					chk2 /= 2;
					cnt++;
				}
				
				// 2진법 변경한 거 최종 역순 출력
				for(int j = n - 1; j >= 0; j--) {
					result += chk.charAt(j);
				}
				
				answer[i] = result;
			}
			
			return answer;
		}
	}
}
