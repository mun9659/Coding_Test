package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 개의 숫자열
public class Quiz_01959 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] n_arr = new int[n]; 
			int[] m_arr = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				n_arr[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				m_arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = 0;
			if(m > n) {
				for(int i = 0; i <= m - n; i++) {
					int sum = 0, idx = i;
					for(int j = 0; j < n; j++) {
						sum += m_arr[idx++] * n_arr[j];
					}
					max = Math.max(max, sum);
				}
			} else if(n > m){
				for(int i = 0; i <= n - m; i++) {
					int sum = 0, idx = i;
					for(int j = 0; j < m; j++) {
						sum += n_arr[idx++] * m_arr[j];
					}
					max = Math.max(max, sum);
				}
			} else {
				for(int i = 0; i < n; i++) {
					max += n_arr[i] * m_arr[i];
				}
			}
			sb.append("#"+tc).append(' ').append(max).append("\n");
		}
		System.out.println(sb);
	}
}
