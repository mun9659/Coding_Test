package back_jun.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 집 주소
public class Quiz_01284 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] width = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
		
		while(true) {
			String num = br.readLine();
			int sum_width = 1; // 첫 여백 1cm
			
			if(num.equals("0")) break;
			else {
				for(int i = 0; i < num.split("").length; i++) {
					sum_width += width[Integer.parseInt(num.split("")[i])] + 1;
				}
			}
			System.out.println(sum_width);
		}
	}
}
