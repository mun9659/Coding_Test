package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.TreeMap;

// 생태학
// 시간 초과(Treemap으로 해결?), NullPointer 에러 발생(End Of File로 인한 null 체크 조건 추가)
public class Quiz_04358 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int count = 0;
		TreeMap<String, Double> map = new TreeMap<>();
		while((str = br.readLine()) != null) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1.0);
			}
			count++;
		}
		
		// 1. 사전순 출력(내림차순)
		// List<String> arr = new ArrayList<>(map.keySet());
		// Collections.sort(arr); // O(nlog(n)) -> 최대 10000개까지여서 시간 제한의 1초(1000ms)를 넘기 때문에 이를 배제
		
		// System.out.println(arr);
		
		// 1. 사전 순서 백분율 정의(TreeMap은 맵에 추가할 때마다 바로바로 정렬해준다.)
		for(Entry<String, Double> entry : map.entrySet()) {
			double percent = entry.getValue() / count * 100;
			String per = String.format("%.4f", percent);
			sb.append(entry.getKey()).append(" ").append(per).append("\n");
		}
		System.out.println(sb);
	}
}