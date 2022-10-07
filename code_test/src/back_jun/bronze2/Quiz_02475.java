package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 직사각형에서 탈출
public class Quiz_02475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
	}
}
