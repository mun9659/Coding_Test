package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 동전 0
public class Quiz_11047 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 동전의 종류 개수
		int k = Integer.parseInt(st.nextToken()); // 가치의 합
		
		List<Integer> n_arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			n_arr.add(Integer.parseInt(br.readLine()));
		}
		
		n_arr.sort(Comparator.reverseOrder());
		
		int count = 0, idx = 0;
		while(k != 0) {
			count += k / n_arr.get(idx);
			k %= n_arr.get(idx++);
		}
		System.out.println(count);
	}
}