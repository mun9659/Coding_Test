package programmers.level01;

// 하샤드 수
public class Ex08 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int x = 10;
		
		System.out.println(s.solution(x));
	}
	
	static class Solution {
		public boolean solution(int x) {
			String num = String.valueOf(x);
			String[] num_arr = num.split("");
			int hashad = 0;
			
			for(int i = 0; i < num_arr.length; i++) {
				hashad += Integer.parseInt(num_arr[i]);
			}
			
			return x % hashad == 0 ? true : false;
		}
	}
}
