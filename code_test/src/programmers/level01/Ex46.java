package programmers.level01;

//소수 만들기
public class Ex46 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int[] nums = {1,2,32,41,12,14,3,9,31};
		
		System.out.println(s.solution(nums));
	}
	
	static class Solution {
		public int solution(int[] nums) {
			int answer = 0;
			
	        for(int i = 0; i < nums.length; i++) {
	            int sum = 0;
	            for(int j = i + 1; j < nums.length; j++) {
	                for(int k = j + 1; k < nums.length; k++) {
	                    sum += (nums[i] + nums[j] + nums[k]);
	                    int cnt = 0;
	                    for(int s = 1; s <= sum; s++) {
	                    	if(sum % s == 0) cnt++;
	                    }
	                    if(cnt == 2) answer++;
	                    sum = 0;
	                }
	            }
	        }

	        return answer;
		}
	}
}
