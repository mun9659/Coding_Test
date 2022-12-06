package back_jun.silver3;

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
		
		int n = Integer.parseInt(br.readLine());
		
		Long[] road_arr = new Long[n - 1];
		long sum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n - 1; i++) {
			long val = Long.parseLong(st.nextToken());
			road_arr[i] = val;
			sum += val;
		}
		
		Long[] oil_arr = new Long[n];
		long max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			long val = Long.parseLong(st.nextToken());
			oil_arr[i] = val;
			max = Math.max(max, val);
		}
		
		// 1. 리터당 가격의 최대값이 1인 경우
		if(max == 1) {
			System.out.println(sum);
			return;
		}
		
		// 2. 나머지인 경우
		//   1) 오일의 값이 이전의 값이 더 싼 경우 현재의 값을 이전의 값으로 변경
		for(int i = 1; i < n - 1; i++) {
			if(oil_arr[i - 1] < oil_arr[i]) {
				oil_arr[i] = oil_arr[i - 1];
			}
		}
		
		long result = 0;
		for(int i = 0; i < n - 1; i++) {
			result += oil_arr[i] * road_arr[i];
		}
		System.out.println(result);
	}
}