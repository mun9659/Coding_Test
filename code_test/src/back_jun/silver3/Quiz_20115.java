package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 에너지 드링크
public class Quiz_20115 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		Double[] arr = new Double[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		double result = arr[n - 1];
		for(int i = 0; i < n - 1; i++) {
			result += (arr[i] / 2);
		}
		
		if(result == (int) result) {
			System.out.println((int) result);
		} else {
			System.out.printf("%.5f", result);
		}
	}
}