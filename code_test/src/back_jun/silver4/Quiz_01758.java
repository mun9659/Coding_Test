package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 알바생 강호
// Integer 를 넘는 값이 있을수도 있으니 Long으로 표현(그리디)
public class Quiz_01758 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 손님 수
		
		// 팁 = 돈 - (등수 - 1)
		List<Long> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			arr.add(Long.parseLong(br.readLine()));
		}
		
		arr.sort(Collections.reverseOrder());
		
		long result = 0;
		for(int i = 0; i < n; i++) {
			result += arr.get(i) - ((i + 1) - 1) < 0 ? 0 : arr.get(i) - ((i + 1) - 1);
		}
		System.out.println(result);
	}
}