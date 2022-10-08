package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
// 다만 이거 기억이 잘 안 나니까 다시 한번더 보기
public class Quiz_02609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int chk_max = (x < y ? y : x);
		int chk_min = (x < y ? x : y);
		
		int max = 0, min = 0;
		
		// 최대공약수
		for(int i = 1; i <= chk_min; i++) {
			if(x % i == 0 && y % i == 0) {
				max = i;
			}
		}
		
		// 최소공배수
		if(chk_max % chk_min == 0) min = chk_max;
		else {
			if(max == 1) min = chk_max * chk_min;
			else min = chk_max * chk_min / max;
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
