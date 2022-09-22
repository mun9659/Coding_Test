package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

// 제일 작은 수 제거하기
public class Ex18 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] arr = {10};
		
		// System.out.println(s.solution(arr, divisor));
		System.out.println(Arrays.toString(s.solution(arr)));
	}
	
	static class Solution {
		public int[] solution(int[] arr) {
			int idx = 0;
			int min = arr[0];
			ArrayList<Integer> chk_arr = new ArrayList<>();
			
			for(int i = 0; i < arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
					idx = i;
				}
				chk_arr.add(arr[i]);
			}
			
			chk_arr.remove(idx);
			
			
			if(chk_arr.size() == 0) {
				chk_arr.add(-1);
			}
			
			int[] answer = new int[chk_arr.size()];
			
			for(int i = 0; i < chk_arr.size(); i++) {
				answer[i] = chk_arr.get(i);
			}
			
			return answer;
		}
	}
}
