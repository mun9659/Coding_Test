package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 피자(Small)
public class Quiz_14606 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(N);
		
		int result = 0;
		while(arr.get(0) != 1) {
			for(int i = 0; i < arr.size(); i+=2) {
				arr.add(i + 1, arr.get(i) / 2);
				arr.set(i, arr.get(i) - arr.get(i) / 2);
				result += arr.get(i) * arr.get(i+1);
			}
			System.out.println(arr);
		}
		System.out.println(result);
		
		br.close();
	}
}