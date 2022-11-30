package programmers.level02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 오픈채팅방
public class Ex33 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		System.out.println(sol.solution(record));
	}
	
	public static class Solution {
		 public List<String> solution(String[] record) {
			 List<String> answer = new ArrayList<>();
			 List<String[]> inout_arr = new ArrayList<>(); // 아이디_출입 리스트
			 HashMap<String, String> id_map = new HashMap<>(); // 아이디_닉네임 맵
			 
			 // O(n)
			 for(String str : record) {
				 String[] arr = str.split(" ");
				 // 1. 유저 아이디의 닉네임 변경시
				 if(!arr[0].equals("Leave")) {
					 id_map.put(arr[1], arr[2]);
				 }
				 
				 // 2. 출입 내역
				 if(!arr[0].equals("Change")) {
					 inout_arr.add(new String[] {arr[0], arr[1]});
				 }
			 }
			 
			 // O(inout_arr.size())
			 for(String[] arr : inout_arr) {
				 String nickname = id_map.get(arr[1]);
				 if(arr[0].equals("Enter")) {
					 answer.add(nickname+"님이 들어왔습니다.");
				 } else {
					 answer.add(nickname+"님이 나갔습니다.");
				 }
			 }
			 
			 return answer;
	    }
	}
}
