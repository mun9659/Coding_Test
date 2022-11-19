package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 8일차- 암호문1
public class Quiz_01228 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			ArrayList<Integer> n_arr = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				n_arr.add(Integer.parseInt(st.nextToken()));
			}
			
			int m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "I");
			String[] m_arr = new String[m];
			for(int i = 0; i < m; i++) {
				m_arr[i] = st.nextToken().trim();
			}
			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(m_arr[i]);
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				ArrayList<Integer> arr = new ArrayList<>();
				for(int j = 0; j < y; j++) {
					arr.add(Integer.parseInt(st.nextToken()));
				}
				
				n_arr.addAll(x, arr);
			}
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < 10; i++) {
				sb.append(n_arr.get(i) + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}