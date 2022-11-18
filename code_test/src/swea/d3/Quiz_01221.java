package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 5일차- GNS
public class Quiz_01221 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String[] numbers = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			String t_str = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			String[] arr = new String[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = st.nextToken();
			}
			
			Arrays.sort(arr, (o1, o2) -> {
				int idx1 = 0, idx2 = 0;
				for(int i = 0; i < numbers.length; i++) {
					if(numbers[i].equals(o1)) {
						idx1 = i;
					}
					if(numbers[i].equals(o2)) {
						idx2 = i;
					}
				}
				return idx1 - idx2;
			});
			
			sb.append("#"+tc).append("\n");
			for(int i = 0; i < n; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}