package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나무 자르기
// 이분 탐색
// 다시 풀기
public class Quiz_02805 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 나무 개수
		int m = Integer.parseInt(st.nextToken()); // 가져갈 나무 길이
		
		int[] tree = new int[n];
		long max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			max = Math.max(max, num);
			tree[i] = num;
		}
		
		max++; // 큰 값이 1일때 0 + 1 / 2 해서 0의 오류가 나타나기 때문에 max를 더한다.
		
		long min = 0;
		long mid = 0;
		
		// upper bound
		while(min < max) {
			mid = (max + min) / 2;
			
			long count = 0;
			for(int i = 0; i < n; i++) {
				count += (tree[i] - mid < 0 ? 0 : tree[i] - mid);
			}
			
			if(count < m) max = mid;
			else min = mid + 1;
		}
		System.out.println(min - 1);
	}
}