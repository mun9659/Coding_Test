package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 패션왕 신해빈
// 다시 풀기
public class Quiz_09375 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < t; tc++) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				String name = st.nextToken();
				String type = st.nextToken();
				
				if(map.containsKey(type)) map.put(type, map.get(type) + 1);
				else map.put(type, 1);
			}
			
			int result = 1;
			for(int value : map.values()) {
				result *= (value + 1);
			}
			sb.append((result - 1)+"\n");
		}
		System.out.println(sb);
	}
}