package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 공
public class Quiz_01547 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		boolean[] ball = {true, false, false};
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int X = Integer.parseInt(st.nextToken()) - 1;
			int Y = Integer.parseInt(st.nextToken()) - 1;
			
			if(ball[X]) {
				ball[X] = false;
				ball[Y] = true;
			} else if(ball[Y]) {
				ball[Y] = false;
				ball[X] = true;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(ball[i]) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
