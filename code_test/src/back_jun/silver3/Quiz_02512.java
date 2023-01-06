package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 예산
// 내기 전에 한번 고찰하고 하자
public class Quiz_02512 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()); // 지방 수
		
		// 각 지방에 대한 예산
		int max = 0, sum = 0;
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
			max = Math.max(max, num);
			arr[i] = num;
		}
		
		int m = Integer.parseInt(br.readLine()); // 총 예산
		
		// 1. 총 예산이 각 지방의 총 예산액보다 크다면 최대 예산 출력
		if(m >= sum) {
			System.out.println(max);
		} 
		// 2. 총 예산이 각 지방의 총 예산액보다 작다면 0 ~ 최대값 사이의 m보다 같거나 낮은 최대 예산 출력
		else {
			Arrays.sort(arr);
			
			int left = 0;
			int right = max;
			int answer = 0;
			
			while(left < right) {
				int mid = (left + right) / 2;
				
				int sum2 = 0;
				for(int i = 0; i < arr.length; i++) {
					if(mid > arr[i]) sum2 += arr[i];
					else sum2 += mid;
				}
				
				if(m < sum2) right = mid;
				else {
					left = mid + 1;
					answer = Math.max(answer, mid);
				}
			}
			
			System.out.println(answer);
		}
	}
}