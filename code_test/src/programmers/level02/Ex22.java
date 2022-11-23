package programmers.level02;

import java.util.Arrays;

// H-Index
// 너무 해맸다... 이거 먼저 답을 보면서 이해해보고 풀어보자
public class Ex22 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// int[] citations = {3,0,6,1,5};
		// int[] citations = {6,5,5,5,3,2,1,0};
		int[] citations = {10,10,10,10,10,10,10,10,10,10,10,10,10};
		
		System.out.println(s.solution(citations));
	}
	
	static class Solution {
		public int solution(int[] citations) {
			int answer = 0;
			Arrays.sort(citations);
			
			for(int i = 0; i < citations.length; i++) {
				int h = citations.length - 1;
				
				if(citations[i] >= h) {
					answer = h;
					break;
				}
			}
			
			return answer;
		}
	}
}
