package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 랜선 자르기
// 이분 탐색
// 답을 또 봄, 다시 또 복기하기
public class Quiz_01654 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 수
		int n = Integer.parseInt(st.nextToken()); // 만들어야하는 랜선 수
		int[] arr = new int[k];
		
		long max = 0;
		for(int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine());
			max = Math.max(max, num);
			arr[i] = num;
		}
		
		max++;
		
		long min = 0;
		long mid = 0;
		
		// upper bound
		while(min < max) {
			mid = (max + min) / 2;
			
			long count = 0;
			for(int i = 0; i < k; i++) {
				count += arr[i] / mid;
			}
			
			if(count < n) max = mid; // count가 작으면 자르는 길이를 줄여야 하기에 max를 mid로 배치
			else min = mid + 1; // count가 크면 자르는 길이를 늘리면 되기에 min을 mid + 1로 배치
		}
		System.out.println(min - 1);
	}
}