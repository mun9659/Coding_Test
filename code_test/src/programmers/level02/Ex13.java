package programmers.level02;

// 유클리드 호제법
public class Ex13 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// int[] arr = {2,6,8,14};
		// int[] arr = {1, 3, 9, 5, 7, 10};
		int[] arr = {1,2,3};
		
		System.out.println(s.solution(arr));
	}
	
	static class Solution {
		public int solution(int[] arr) {
			int gcd = 0, lcm = 1;
			for(int i = 0; i < arr.length - 1; i++) {
				if(i == 0) {
					gcd = gcd(arr[i], arr[i + 1]);
					lcm = arr[i] * arr[i + 1] / gcd;
				} else {
					gcd = gcd(lcm, arr[i + 1]);
					lcm = lcm * arr[i + 1] / gcd;
				}
			}
			
			return lcm;
		}
	}
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0) return num1;
		else return gcd(num2, num1 % num2);
	}
}