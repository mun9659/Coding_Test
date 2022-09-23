package programmers.level01;


// 부족한 금액 계산하기
public class Ex28 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int price = 3;
		int money = 20;
		int count = 4;
		
		System.out.println(s.solution(price, money, count));
	}
	
	static class Solution {
		public long solution(int price, int money, int count) {
			long sum = 0;
			int n = 0;
			
			while(n++ != count) {
				sum += price * n;
			}
			
			return (money - sum) < 0 ? sum - money : 0;
		}
	}
}
