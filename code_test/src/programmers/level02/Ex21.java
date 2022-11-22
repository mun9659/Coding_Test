package programmers.level02;

// 튜플
// 가장 빈번한 숫자가 앞에서 나온다.
// 다시 한번더 풀어보자
public class Ex21 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// String str = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		// String str = "{{1,2,3},{2,1},{2,1,3,4},{2}}";
		String str = "{{20,111},{111}}";
		// String str = "{{123}}";
		// String str = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public int[] solution(String s) {
			int[] result = {};
			
			return result;
		}
	}
}
