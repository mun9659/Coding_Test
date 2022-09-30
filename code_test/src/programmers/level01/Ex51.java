package programmers.level01;

import java.util.HashMap;
import java.util.Map;

// 완주하지 못한 선수(정답을 봐버림)
public class Ex51 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// String[] participant = {"leo", "kiki", "eden"};
		//String[] completion = {"eden", "kiki"};
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		// String[] participant = {"mislav", "stanko", "mislav", "ana", "mislav"};
		// String[] completion = {"stanko", "ana", "mislav", "mislav"};
		
		System.out.println(s.solution(participant, completion));
	}
	
	static class Solution {
		public String solution(String[] participant, String[] completion) {
			String answer = "";
			HashMap<String, Integer> part_map = new HashMap<>();
			for(int i = 0; i < participant.length; i++) {
				if(part_map.containsKey(participant[i])) {
					int cnt = (int)part_map.get(participant[i]);
					part_map.put(participant[i], cnt + 1);
				} else {
					part_map.put(participant[i], 1);
				}
			}
			
			for(int i = 0; i < completion.length; i++) {
				if(part_map.containsKey(completion[i])) part_map.replace(completion[i], part_map.get(completion[i]) - 1);
			}
			
			for(Map.Entry<String, Integer> item : part_map.entrySet()) {
				if(item.getValue() > 0) {
					return item.getKey();
				}
			}
			
	        return answer;
		}
	}
}

/*
 * 1. 효율성에서 실패
	ArrayList<String> part_arr = new ArrayList<>(); // ArrayList 참석 선수
			
	for(int i = 0; i < participant.length; i++) {
		part_arr.add(participant[i]);
	}
	
	for(int i = 0; i < completion.length; i++) {
		part_arr.remove(completion[i]);
	}
	
    return part_arr.get(0);
*/