package programmers.level02;

import java.util.LinkedList;

// 멀리 뛰기
// 뻘짓했음, 좋은건 LinkedList로 비교해서 빼면 되었다.
public class Ex19 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// int cacheSize = 3;
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		// int cacheSize = 3;
		//String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		// int cacheSize = 2;
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		// int cacheSize = 5;
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		// int cacheSize = 2;
		// String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
		int cacheSize = 0;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		
		System.out.println(s.solution(cacheSize, cities));
	}
	
	static class Solution {
		public int solution(int cacheSize, String[] cities) {
			if(cacheSize == 0) {
				return 5 * cities.length; 
			}
			
			int answer = 0;
			LinkedList<String> cache = new LinkedList<>();
			for(int i = 0; i < cities.length; i++) {
				String s = cities[i].toLowerCase();
				if(cache.remove(s)) {
					answer += 1;
					cache.add(s);
				} else {
					answer += 5;
					if(cache.size() >= cacheSize) {
						cache.remove();
					}
					cache.add(s);
				}
			}
			
			return answer;
		}
	}
}

/*
1. 처음에 내가 푼것, 20개 중 4개 틀림

ArrayList<String> cacheArr = new ArrayList<>();
int[] arrUsed = new int[cacheSize];

for(int i = 0; i < cities.length; i++) {
	
	boolean check = false;
	// 1. 아예 cache 리스트가 존재하지 않는다면
	if(cacheSize == 0) {
		answer += 5;
	}
	if(check) continue;
	
	// 2. 캐시에 도시가 있는지 체크
	for(int j = 0; j < cacheArr.size(); j++) {
		if((cacheArr.get(j).toLowerCase()).equals(cities[i].toLowerCase())) {
			check = true;
			answer += 1;
			arrUsed[j] = 1;
		} else {
			arrUsed[j]++;
		}
	}
	if(check) continue;
	
	// 3. LRU알고리즘에 따른 값 변경
	for(int j = 0; j< cacheSize; j++) {
		if(arrUsed[j] >= cacheSize) { // 바꿔야할 값이 cacheSize와 동일할 때 바꾸게 한다.
			check = true;
			answer += 5;
			arrUsed[j] = 0;
			cacheArr.set(j, cities[i]);
			break;
		}
	}
	if(check) continue;
	
	// 4. cache 리스트가 꽉차지 않았다면
	if(cacheArr.size() < cacheSize) {
		answer += 5;
		cacheArr.add(cities[i]);
	}
}
*/