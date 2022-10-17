package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 직각삼각형
public class Quiz_04153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			if(x + y + z == 0) break;
			
			if(x > y) {
				int temp = x;
				x = y;
				y = temp;
			}
			
			if(y > z) {
				int temp = y;
				y = z;
				z = temp;
			}
			
			if(Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}
