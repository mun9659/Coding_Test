package programmers.level01;


// 음양 더하기
public class Ex19 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] absoluteds = {1, 2, 3};
		boolean[] signs = {false, false, true};
		
		System.out.println(s.solution(absoluteds, signs));
	}
	
	static class Solution {
		public int solution(int[] absolutes, boolean[] signs) {
			int answer = 0;
			
			for(int i = 0; i < absolutes.length; i++) {
				answer += absolutes[i] * (signs[i] == true ? 1 : -1);
			}
			
			return answer;
		}
	}
}
