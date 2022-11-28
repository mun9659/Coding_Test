package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 문자열 집합
// 첫 번째 시도 : 메모리 30912KB, 시간 2720ms 성공 (ArrayList, contains)
// 두 번째 시도 : 메모리 31556KB, 시간 436ms 성공 (TreeMap, containsKey)
// 세 번째 시도 : 메모리 31352KB, 시간 412ms 성공 (HashMap, containsKey)
// 차이점은?
// -> ArrayList의 contains는 시간복잡도를 O(n)을 가진다. 
// -> HashMap의 contains는 시간복잡도를 O(1)을 가진다.
// -> TreeMap의 contains는 시간복잡도를 O(log n)을 가진다.
public class Quiz_14425 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 집합 S에 포함되어 있는 문자열
		int m = Integer.parseInt(st.nextToken()); // 검사해야 하는 문자열
		int answer = 0;
		/*
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(br.readLine());
		}
		
		int answer = 0;
		for(int i = 0; i < m; i++) {
			if(arr.contains(br.readLine())) {
				answer++;
			}
		}
		*/
		/*
		TreeMap<String, Integer> tree = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			tree.put(br.readLine(), i);
		}
		
		for(int i = 0; i < m; i++) {
			if(tree.containsKey(br.readLine())) {
				answer++;
			}
		}
		*/
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), i);
		}
		
		for(int i = 0; i < m; i++) {
			if(map.containsKey(br.readLine())) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}