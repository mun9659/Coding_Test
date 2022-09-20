package programmers.level01;

// 평균 구하기
public class Ex02 {
	public static void main(String[] args) throws Exception {
		
		int[] arr = {1,2,3,4};
		Solution s = new Solution();
		
		System.out.println(s.solution(arr));
	}
	
	static class Solution {
		public double solution(int[] arr) {
			double answer = 0;
			
			for(int i = 0; i < arr.length; i++) {
				answer += arr[i];
			}
			
			return answer / arr.length;
		}
	}
}
