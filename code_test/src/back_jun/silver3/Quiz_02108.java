package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// 통계학
// 정렬
public class Quiz_02108 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] chk_arr = new int[8001];
		ArrayList<Integer> idx_arr = new ArrayList<>();
		double sum = 0;
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			chk_arr[4000 + num]++;
			sum += num;
		}
		
		int max = 0, idx = 0;
		for(int i = 0; i < chk_arr.length; i++) {
			if(max < chk_arr[i]) {
				max = chk_arr[i];
			}
		}
		
		for(int i = 0; i < chk_arr.length; i++) {
			if(max == chk_arr[i]) {
				idx_arr.add(i);
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(Math.round(sum / n));
		System.out.println(arr[n / 2]);
		System.out.println(idx_arr.size() > 1 ? idx_arr.get(1) - 4000 : idx_arr.get(0) - 4000); // 최빈값
		System.out.println(arr[n-1] - arr[0]);
	}
}