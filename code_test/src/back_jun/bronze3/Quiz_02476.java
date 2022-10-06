package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주사위 게임
public class Quiz_02476 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int d1 = Integer.parseInt(st.nextToken());
			int d2 = Integer.parseInt(st.nextToken());
			int d3 = Integer.parseInt(st.nextToken());
			int money = 0;
			
			if(d1 == d2 && d2 == d3) {
				money += 10000 + (d1 * 1000);
			} else if(d1 == d2 || d2 == d3 || d1 == d3) { // 이 구현이 문제...
				money += 1000 + (d1 == d2 ? d1 * 100 : d2 == d3 ? d2 * 100 : d3 * 100);
			} else {
				money += Math.max(Math.max(d1, d2), d3) * 100;
			}
			
			if(max < money) max = money;
		}
		
		System.out.println(max);
		
		br.close();
	}
}