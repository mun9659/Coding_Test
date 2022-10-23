package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 조교의 성적 매기기
public class Quiz_01983 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 학생 수
			int k = Integer.parseInt(st.nextToken()); // k번째 학생 평점 확인
			
			ArrayList<Double> arr = new ArrayList<>();
			double chk = 0;
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int mid = Integer.parseInt(st.nextToken());
				int fin = Integer.parseInt(st.nextToken());
				int assign = Integer.parseInt(st.nextToken());
				
				arr.add((mid * 0.35) + (fin * 0.45) + (assign * 0.2));
				if(k - 1 == i) chk = arr.get(i);
			}
			
			arr.sort(Collections.reverseOrder());
			
			int size = arr.size() / 10;
			int idx = arr.indexOf(chk) + 1;
			String result = "";
			if(idx <= size) {
				result = "A+";
			} else if(idx > size && idx <= size * 2) {
				result = "A0";
			} else if(idx > size * 2 && idx <= size * 3) {
				result = "A-";
			} else if(idx > size * 3&& idx <= size * 4) {
				result = "B+";
			} else if(idx > size * 4 && idx <= size * 5) {
				result = "B0";
			} else if(idx > size * 5 && idx <= size * 6) {
				result = "B*";
			} else if(idx > size * 6 && idx <= size * 7) {
				result = "C+";
			} else if(idx > size * 7 && idx <= size * 8) {
				result = "C0";
			} else if(idx > size * 8 && idx <= size * 9) {
				result = "C-";
			} else {
				result = "D0";
			}
			System.out.printf("#%d %s", tc, result);
		}
	}
}
