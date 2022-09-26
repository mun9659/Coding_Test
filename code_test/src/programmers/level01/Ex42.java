package programmers.level01;

// 2016년
public class Ex42 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int a = 5;
		int b = 24;
		
		System.out.println(s.solution(a, b));
	}
	
	static class Solution {
		public String solution(int a, int b) {
			String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
			int[] month_day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			int sum_day = -1;
			for(int i = 0; i < a; i++) {
				sum_day += month_day[i];
			}
			sum_day += b;
			
			return week[sum_day % 7];
		}
	}
}
