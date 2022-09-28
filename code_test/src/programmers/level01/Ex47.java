package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//실패율(정답을 봄, 매우 어려움, 다트보다 훨씬)
public class Ex47 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		int N = 5; // 스테이지 개수
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 사용자가 현재 도전 중인 스테이지의 번호
		
		System.out.println(Arrays.toString(s.solution(N, stages)));
	}
	
	static class Solution {
		public int[] solution(int N, int[] stages) {
			Map<Integer, Double> map = new HashMap<>();
			
			int[] userFailCnts = new int[N+2]; // 각 스테이지에 머물러있는 플레이어
			int[] userTotalCnts = new int[N+1]; // 각 스테이지에 도달한 플레이어 수
			
			// 스테이지 별 머물러있는 플레이어 수 카운트
			for(int stage : stages) {
				userFailCnts[stage]++;
			}
			
			// 스테이지 별 도달한 플레이어 수 카운트
			userTotalCnts[N] = userFailCnts[N]+userFailCnts[N+1];
			for(int i = N-1; i >= 1; i--) {
				userTotalCnts[i] = userFailCnts[i] + userTotalCnts[i+1];
			}
			
			// 스테이지 별 실패율 계산
			for(int i = 1; i < userTotalCnts.length; i++) {
				if(userFailCnts[i] == 0 || userTotalCnts[i] == 0) {
					map.put(i, 0.0);
				} else {
					map.put(i, (double)userFailCnts[i] / userTotalCnts[i]);
				}
			}
			
			// 실패율(value) 값으로 스테이지번호(key)를 내림차순 정렬(여기가 중요, Collections에 대해 전혀 모르고 있음)
			List<Integer> list = new ArrayList<>(map.keySet());
			Collections.sort(list,  (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
			
	        return list.stream().mapToInt(Integer::intValue).toArray();
		}
	}
}
