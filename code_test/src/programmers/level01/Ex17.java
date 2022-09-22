package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Ex17 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] arr = {3,2,6};
		int divisor = 10;
		
		// System.out.println(s.solution(arr, divisor));
		System.out.println(Arrays.toString(s.solution(arr, divisor)));
	}
	
	static class Solution {
		public int[] solution(int[] arr, int divisor) {
			ArrayList<Integer> chk_arr = new ArrayList<>();
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % divisor == 0) {
					chk_arr.add(arr[i]);
				}
			}
			int[] answer;
			
			if(chk_arr.size() == 0) {
				answer = new int[1];
				answer[0] = -1;
			} else {
				chk_arr.sort(null);
				answer = new int[chk_arr.size()];
				
				for(int i = 0; i < chk_arr.size(); i++) {
					answer[i] = chk_arr.get(i);
				}
			}
			
			return answer;
		}
	}
}
