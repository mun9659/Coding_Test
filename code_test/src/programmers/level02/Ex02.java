package programmers.level02;

// JadenCase 문자열 만들기(도무지 왜 틀린지 몰라서 정답을 봄)
public class Ex02 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// String str = "3Peo     ple    unFoll owed     me     ";
		String str = "for the last week";
		
		System.out.println(s.solution(str));
	}
	
	static class Solution {
		public String solution(String s) {
			// 숫자는 단어의 첫 문자로만 나옵니다.
			// 숫자로만 이루어진 단어는 없습니다.
			// 공백문자가 연속해서 나올 수 있습니다.(중요)
			String answer = "";
			// String[] arr = s.toLowerCase().split(" ");
			String[] arr = s.toLowerCase().split("");
			boolean chk = true;
			
			for(String str : arr) {
				// if(arr[i].length() > 0) answer += (arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length()) + (i == arr[i].length() - 1 ? "" : " "));
				answer += chk ? str.toUpperCase() : str;
				chk = str.equals(" ") ? true : false;
			}
			
			return answer;
		}
	}
}


