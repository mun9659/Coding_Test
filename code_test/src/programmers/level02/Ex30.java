package programmers.level02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 주차 요금 계산
// 정확성 테스트 : 10초
public class Ex30 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		// int[] fees = {180, 5000, 10, 600};
		// String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		// int[] fees = {120, 0, 60, 591};
		// String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
		int[] fees = {1, 461, 1, 10};
		String[] records = {"00:00 1234 IN"};
		
		System.out.println(sol.solution(fees, records));
	}
	
	public static class Solution {
		 public List<Integer> solution(int[] fees, String[] records) {
			List<Integer> answer = new ArrayList<>();
			
			int basic_time = fees[0]; // 기본 시간
			int basic_fee = fees[1]; // 기본 요금
			double unit_time = fees[2]; // 단위 시간
			int unit_fee = fees[3]; // 단위 요금
			
			List<String[]> record = new ArrayList<>();
			Map<String, Integer> map = new HashMap<>();
			for(int i = 0; i < records.length; i++) {
				record.add(records[i].split(" "));
			}
			
			// 1. 총 시간 계산
			for(int i = 0; i < record.size(); i++) {
				String time = record.get(i)[0];
				String car_num = record.get(i)[1];
				String in_out = record.get(i)[2];
				
				if(in_out.equals("IN")) {
					int cal = time_cal("23:59") - time_cal(time);
					for(int j = i + 1; j < record.size(); j++) {
						String chk_time = record.get(j)[0];
						String chk_car_num = record.get(j)[1];
						String chk_in_out = record.get(j)[2];
						
						if(car_num.equals(chk_car_num) && chk_in_out.equals("OUT")) {
							cal = Math.min(cal, time_cal(chk_time) - time_cal(time));
							break;
						}
						
					}
					
					if(map.containsKey(car_num)) {
						map.put(car_num, map.get(car_num) + cal);
					} else {
						map.put(car_num, cal);
					}
				}
			}
			
			// 2. 시간에 따른 요금 계산
			List<String> keySet = new ArrayList<>(map.keySet());
			Collections.sort(keySet);
			
			for(String s : keySet) {
				int time = map.get(s);
				
				int result_fee = 0;
				if(time > basic_time) {
					result_fee = basic_fee + (int) (Math.ceil((time - basic_time) / unit_time) * unit_fee);
				} else {
					result_fee = basic_fee;
				}
				answer.add(result_fee);
			}
			
	        return answer;
	    }
		
		// (공용) 시간 계산
		public static int time_cal(String time) {
			String[] time_arr = time.split(":");
			
			int t = Integer.parseInt(time_arr[0]);
			int m = Integer.parseInt(time_arr[1]);
			
			return t * 60 + m;
		}
	}
}
