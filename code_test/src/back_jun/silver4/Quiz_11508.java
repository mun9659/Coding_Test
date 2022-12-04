package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 2+1 세일
public class Quiz_11508 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		arr.sort(Comparator.reverseOrder());
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			if(i % 3 == 2) continue;
			result += arr.get(i);
		}
		
		System.out.println(result);
	}
}