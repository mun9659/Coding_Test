package programmers.level01;

// 문자열 내 p와 y의 개수
public class Ex07 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		String str = "Pyy";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public boolean solution(String s) {
			int pNum = 0;
			int yNum = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(s.toLowerCase().charAt(i) == 'p') pNum++;
				else if(s.toLowerCase().charAt(i) == 'y') yNum++;
			}
			
			return pNum == yNum ? true : false;
		}
	}
}
