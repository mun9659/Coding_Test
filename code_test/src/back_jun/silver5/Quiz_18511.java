package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 큰 수 구성하기
// 뭔가 알듯 한데 조금 틀리다... 좀 더 보자
public class Quiz_18511 {
	
	public static int n, k, result = 0;
	public static int[] arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		arr = new int[k];
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		dfs(0);
		
		System.out.println(result);
	}
	
	public static void dfs(int now) {
		if(now > n) return;
		
		if(result < now) result = now;
		
		for(int i = k - 1; i >= 0; i--) {
			dfs(now * 10 + arr[i]);
		}
	}
}