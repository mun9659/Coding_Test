package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 서강근육맨
public class Quiz_20300 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		List<Long> arr = new ArrayList<>();
		long max = 0;
		for(int i = 0; i < n; i++) {
			long val = Long.parseLong(st.nextToken());
			arr.add(val);
			max = Math.max(max, val);
		}
		
		arr.sort(null);
		if(arr.size() % 2 != 0) arr.remove(max);
		
		long result = 0;
		for(int i = 0; i < arr.size() / 2; i++) {
			result = Math.max(result, arr.get(i) + arr.get(arr.size() - 1 - i));
		}
		
		System.out.println(Math.max(max, result));
	}
}