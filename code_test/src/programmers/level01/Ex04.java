package programmers.level01;

// 정수 제곱근 판별
public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		long n = 3;
		Solution s = new Solution();
		
		System.out.println(s.solution(n));
		
	}
	
	static class Solution {
		public long solution(long n) {
			Double answer = Math.sqrt(n);
			
			if(answer == answer.intValue()) { // Double 클래스 확인
				return (long)Math.pow(answer + 1, 2);
			} else {
				return -1;
			}
		}
	}
}
