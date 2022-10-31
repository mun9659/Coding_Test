package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0
public class Quiz_11047 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[n];
		
		for(int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		while(k != 0) {
			for(int i = n - 1; i >= 0; i--) {
				int coin = coins[i];
				if(k < coin) continue;
				else {
					cnt += k / coin;
					k %= coin;
				}
			}
		}
		System.out.println(cnt);
	}
}