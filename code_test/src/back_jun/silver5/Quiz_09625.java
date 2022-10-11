package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// BABBA
// 버튼을 누르면 B -> BA, A -> B 로 변경
// DP 를 사용
// A -> B -> BA -> BAB -> BABBA -> BABBABAB -> BABBABABBA
// - -> - -> A추가 -> B추가 -> BA추가 -> BAB추가 -> BABBA 추가 -> ...
public class Quiz_09625 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr_A = new ArrayList<>();
		ArrayList<Integer> arr_B = new ArrayList<>();
		arr_A.add(1);
		arr_A.add(0);
		arr_B.add(0);
		arr_B.add(1);
		
		int n = 0;
		while(n <= K) {
			if(n >= 2) {
				arr_A.add(arr_A.get(n-1) + arr_A.get(n-2));
				arr_B.add(arr_B.get(n-1) + arr_B.get(n-2));
			} 
			n++;
		}
		System.out.printf("%d %d", arr_A.get(K), arr_B.get(K));
		
		// 이 방식으로 쓰면 시간 초과 확정
		/*
		int n = 0;
		while(n != K) {
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i).equals("A")) arr.set(i, "B");
				else {
					arr.add(i+1, "A");
					i++;
				}
			}
			n++;
			System.out.println(arr);
		}
		*/
		
		br.close();
	}
}