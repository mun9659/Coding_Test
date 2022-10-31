package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 비밀번호 찾기
public class Quiz_17219 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String site = st.nextToken();
			String pwd = st.nextToken();
			
			map.put(site, pwd);
		}
		
		for(int i = 0; i < m; i++) {
			sb.append(map.get(br.readLine())+"\n");
		}
		System.out.println(sb);
	}
}