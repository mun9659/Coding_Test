package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// Sort 마스터 배지훈의 후계자
public class Quiz_20551 {
	
	public static int n, m;
	public static int[] arr;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}
		}
		
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(br.readLine());
			if(map.containsKey(num)) sb.append(map.get(num)).append("\n");
			else sb.append(-1).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int bSearch(int num) {
		int left = 0;
		int right = n - 1;
		int mid = 0;
		
		while(left < right) {
			mid = (left + right) / 2;
			
			if(arr[mid] < num) left = mid + 1;
			else right = mid;
		}
		
		return right;
	}
}