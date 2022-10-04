package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 핸드폰 요금
// 영식 요금제 : 30초마다 10원씩 추가
// 민식 요금제 : 60초마다 15원씩 추가
public class Quiz_01267 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int young = 0, min = 0;
		for(int i = 0; i < N; i++) {
			int chk = Integer.parseInt(st.nextToken());
			young += 10 * ((chk / 30) + 1);
			min += 15 * ((chk / 60) + 1);
		}
		
		
		if(young < min) {
			System.out.println("Y " + young);
		} else if(young > min) {
			System.out.println("M " + min);
		} else {
			System.out.println("Y M " + young);
		}
	}
}
