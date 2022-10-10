package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 디지털시계
public class Quiz_01942 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String[] t1_arr = st.nextToken().split(":");
			String[] t2_arr = st.nextToken().split(":");
			
			int t1_h = Integer.parseInt(t1_arr[0]), t1_m = Integer.parseInt(t1_arr[1]), t1_s = Integer.parseInt(t1_arr[2]);
			int t2_h = Integer.parseInt(t2_arr[0]), t2_m = Integer.parseInt(t2_arr[1]), t2_s = Integer.parseInt(t2_arr[2]);
			
			int cnt = 0;
			while(true) {
				if(t1_s == 60) {
					t1_m += 1;
					t1_s = 0;
				}
				if(t1_m == 60) {
					t1_h += 1;
					t1_m = 0;
				}
				if(t1_h == 24) {
					t1_h = 0;
					t1_m = 0;
					t1_s = 0;
				}
				String t1_h1 = t1_h < 10 ? "0" + t1_h : "" + t1_h;
				String t1_m1 = t1_m < 10 ? "0" + t1_m : "" + t1_m;
				String t1_s1 = t1_s < 10 ? "0" + t1_s : "" + t1_s;
				
				String value = t1_h1 + t1_m1 + t1_s1;
				if(Integer.parseInt(value) % 3 == 0) cnt++;
						
				if(t1_h == t2_h && t1_m == t2_m && t1_s == t2_s) {
					break;
				}
				t1_s += 1;
			}
			System.out.println(cnt);
		}
	}
}
