package programmers.level01;

import java.util.Arrays;

// 로또의 최고 순위와 최저 순위
public class Ex49 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		System.out.println(Arrays.toString(s.solution(lottos, win_nums)));
	}
	
	static class Solution {
		public int[] solution(int[] lottos, int[] win_nums) {
			int[] answer = new int[2];
			int min = 0, max = 0;
			
			for(int i = 0; i < win_nums.length; i++) {
				for(int j = 0; j < lottos.length; j++) {
					if(lottos[j] == win_nums[i]) {
						max++;
						min++;
					}
				}
				if(lottos[i] == 0) max++;
			}
			
			if(max <= 1) {
				answer[0] = 6;
			} else {
				answer[0] = 6 - (max - 1);
			}
			
			if(min <= 1) {
				answer[1] = 6;
			} else {
				answer[1] = 6 - (min - 1);
			}
			
	        return answer;
		}
	}
}
