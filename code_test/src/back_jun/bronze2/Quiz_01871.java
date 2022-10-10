package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 좋은 자동차 번호판
public class Quiz_01871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String[] car_arr = br.readLine().split("-");;
			
			int sum = 0;
			for(int j = 0; j < car_arr[0].length(); j++) {
				sum += (car_arr[0].charAt(j) - 'A') * Math.pow(26, car_arr[0].length() - 1 - j);
			}
			
			if(Math.abs(sum - Integer.parseInt(car_arr[1])) <= 100) System.out.println("nice");
			else System.out.println("not nice");
		}
	}
}
