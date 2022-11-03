package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// 좌표 압축
// 거의 다 해놓고 헷갈려서 답을 봄 다시 풀자
public class Quiz_18870 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int[] n_arr = new int[n];
		int[] sort_arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sort_arr[i] = n_arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sort_arr);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int rank = 0;
		for(int val : sort_arr) {
			if(!map.containsKey(val)) map.put(val, rank++);
		}
		
		for(int i : n_arr) {
			sb.append(map.get(i) + " ");
		}
		System.out.println(sb);
	}
}