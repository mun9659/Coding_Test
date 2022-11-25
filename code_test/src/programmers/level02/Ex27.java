package programmers.level02;


// 타겟 넘버
public class Ex27 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// int[] numbers = {1,1,1,1,1};
		// int target = 3;
		int[] numbers = {4,1,2,1};
		int target = 4;
		
		System.out.println(s.solution(numbers, target));
	}
	
	static class Solution {
		
		public static int t, answer = 0;
		public static int[] arr;
		
		public int solution(int[] numbers, int target) {
			t = target;
			arr = numbers;
			
			dfs(0, arr[0]);
			dfs(0, arr[0] * -1);
			
			return answer;
		}
		
		public static void dfs(int index, int sum) {
			if(index == arr.length - 1) {
				if(sum == t) answer++;
				return;
			}
			
			dfs(index + 1, sum + arr[index + 1]);
			dfs(index + 1, sum - arr[index + 1]);
		}
	}
}
