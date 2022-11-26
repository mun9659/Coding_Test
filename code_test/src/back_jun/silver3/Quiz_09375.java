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
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				String c_name = st.nextToken();
				String c_type = st.nextToken();
				
				if(map.containsKey(c_type)) map.put(c_type, map.get(c_type) + 1);
				else map.put(c_type, 1);
			}
			
			int result = 1;
			for(int val : map.values()) {
				result *= (val + 1);
			}
			
			sb.append(result - 1).append("\n");
		}
		
		System.out.println(sb);
	}
}