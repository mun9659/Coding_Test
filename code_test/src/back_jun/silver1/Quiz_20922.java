package back_jun.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 겹치는 건 싫어
// 답을 봤기에 다시 풀어본다, 생각보다 쉬웠고 머리속에 알고리즘은 떠올랐으나 쓰질 못했다
public class Quiz_20922 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		int[] count = new int[100001];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0, end = 0;
		int max = 0;
		while(start <= end) {
			if(end < n && count[arr[end]] < k) {
				count[arr[end]]++;
				end++;
			}
			
			else if(count[arr[end]] == k) {
				count[arr[start]]--;
				start++;
			}
			max = Math.max(max, end - start);
			if(end == n) break;
		}
		System.out.println(max);
	}
}