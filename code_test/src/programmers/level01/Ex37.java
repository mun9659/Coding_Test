package programmers.level01;

import java.util.Arrays;

// 최소직사각형
public class Ex37 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}}; // {가로길이, 세로길이}
		int[][] sizes = {{10,7}, {12,3}, {8,15}, {14,7}, {5,15}};
		
		System.out.println(s.solution(sizes));
	}
	
	static class Solution {
		public int solution(int[][] sizes) {
			int w = 0;
			int h = 0;
			
			for(int i = 0; i < sizes.length; i++) {
				int temp = 0;
				if(sizes[i][0] < sizes[i][1]) {
					temp = sizes[i][0];
					sizes[i][0] = sizes[i][1];
					sizes[i][1] = temp;
				}
				
				if(w < sizes[i][0]) w = sizes[i][0];
				if(h < sizes[i][1]) h = sizes[i][1];
			}
			
			return w * h;
		}
	}
}
