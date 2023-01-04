package programmers.level01;

// [2021 KAKAO BLIND RECRUITMENT] 신규 아이디 추천
public class Ex54 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id = "z-+.^.";
		// String new_id = "=.=";
		// String new_id = "123_.def";
		// String new_id = "abcdefghijklmn.p";
		
		System.out.println(s.solution(new_id));
	}
	
	static class Solution {
		public String solution(String new_id) {
			// 1단계 : 대문자 -> 소문자
			new_id = new_id.toLowerCase();
			
			// 2단계 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
			new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
			
			// 3단계 : 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
			new_id = new_id.replaceAll("\\.{2,}", ".");
			
			// 4단계 : 마침표가 처음이나 끝에 위치한다면 제거
			new_id = new_id.replaceAll("^(\\.)|(\\.)$", "");
			
			// 5단계 : 빈 문자열이라면 new_id에 "a"를 대입합니다.
			if(new_id.isEmpty()) new_id = "a";
			
			// 6단계 : 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
			// 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
			if(new_id.length() >= 16) {
				new_id = new_id.substring(0, 15);
				
				new_id = new_id.replaceAll("(\\.)$", "");
			}
			
			// 7단계 : 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
			if(new_id.length() <= 2) {
				while(new_id.length() != 3) {
					new_id += new_id.charAt(new_id.length() - 1);
				}
			}
			
	        return new_id;
		}
	}
}
