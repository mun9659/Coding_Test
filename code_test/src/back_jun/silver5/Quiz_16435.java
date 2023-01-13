package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 스네이크버드
public class Quiz_16435 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 과일 개수
		int l = Integer.parseInt(st.nextToken()); // 스네이크버드 초기 길이 정수
		
		st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		list.sort(null);
		
		for(int i = 0; i < list.size(); i++) {
			if(l >= list.get(i)) {
				l++;
			} else {
				break;
			}
		}
		
		System.out.println(l);
	}
}