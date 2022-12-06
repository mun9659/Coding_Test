package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
// 다시 풀어보기
public class Quiz_13305 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine()); // 도시의 개수(2 <= N <= 100,000)
		
		Long[] road_arr = new Long[n - 1];
		Long[] oil_arr = new Long[n];
		
		st = new StringTokenizer(br.readLine());
		long sum = 0;
		for(int i = 0; i < n - 1; i++) {
			Long road = Long.parseLong(st.nextToken());
			road_arr[i] = road;
			sum += road;
		}
		
		st = new StringTokenizer(br.readLine());
		long max = 0;
		for(int i = 0; i < n; i++) {
			Long oil = Long.parseLong(st.nextToken());
			
			// 내림차순 재정렬
			if(i > 0 && oil_arr[i - 1] < oil) {
				oil_arr[i] = oil_arr[i - 1];
			} else {
				oil_arr[i] = oil;
			}
			max = Math.max(max, oil);
		}
		
		
		
		// 모든 주유소의 리터당 가격은 1인 경우
		if(max == 1) {
			System.out.println(sum);
			return;
		}
		
		long result = 0;
		for(int i =0; i < n - 1; i++) {
			result += oil_arr[i] * road_arr[i];
		}
		System.out.println(result);
	}
}