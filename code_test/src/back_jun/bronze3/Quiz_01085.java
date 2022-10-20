package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 직사각형에서 탈출
public class Quiz_01085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.min(Math.min(w - x, x), Math.min(h - y, y)));
	}
}
/*
		String str = br.readLine();
		
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]);
		int w = Integer.parseInt(str.split(" ")[2]);
		int h = Integer.parseInt(str.split(" ")[3]);
		int min_x = 0, min_y = 0;
		
		// x축
		if(x > (w - x)) min_x = w-x;
		else min_x = x;
		
		// y축
		if(y > (h - y)) min_y = h - y;
		else min_y = y;
		
		System.out.println(min_x > min_y ? min_y : min_x);

*/