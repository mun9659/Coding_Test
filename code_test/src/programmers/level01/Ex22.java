package programmers.level01;


// 없는 숫자 더하기
public class Ex22 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		System.out.println(s.solution(numbers));
	}
	
	static class Solution {
		public int solution(int[] numbers) {
			int answer = 45;
			
			for(int i = 0; i < numbers.length; i++) {
				answer -= numbers[i];
			}
			/*
			boolean[] chk_num = new boolean[10];
			
			
			for(int i = 0; i < numbers.length; i++) {
				chk_num[numbers[i]] = true;
			}
			
			for(int i = 0; i < chk_num.length; i++) {
				if(chk_num[i] == false) answer += i;
			}
			*/
			
			return answer;
		}
	}
}
