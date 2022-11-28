package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 나는야 포켓몬 마스터
// 다시 풀기, 일단 String에서 숫자확인하는 것도 알아가기
public class Quiz_01620 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 포켓몬의 개수
		int m = Integer.parseInt(st.nextToken()); // 맞춰야 하는 문제의 개수
		
		Map<String, Integer> map1 = new HashMap<>(); // 이름 Key Map
		Map<Integer, String> map2 = new HashMap<>(); // 숫자 Key Map
		
		for(int i = 1; i <= n; i++) {
			String pokemon = br.readLine();
			map1.put(pokemon, i);
			map2.put(i, pokemon);
		}
		
		for(int i = 0; i < m; i++) {
			String answer = br.readLine();
			
			if(isNumeric(answer)) {
				sb.append(map2.get(Integer.parseInt(answer))).append("\n");
			} else {
				sb.append(map1.get(answer)).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	// 숫자 여부 판단하는거 알아놓자!(NumberFormatException을 통한 try catch문)
	public static boolean isNumeric(String answer) {
		try {
			Double.parseDouble(answer);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}