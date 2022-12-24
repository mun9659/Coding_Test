package back_jun.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 오리
// 다시 풀기
public class Quiz_12933 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] c_arr = br.readLine().toCharArray();
		boolean[] v = new boolean[c_arr.length];
		char[] bol = {'q', 'u', 'a', 'c', 'k'};
		int index = 0, count = 0;
		if(c_arr[0] != 'q' || c_arr.length % 5 != 0) {
			System.out.println(-1);
			return;
		}
		
		for(int i = 0; i < c_arr.length; i++) {
			List<Character> arr = new ArrayList<>();
			for(int j = i; j < c_arr.length; j++) {
				if(!v[j] && c_arr[j] == bol[index]) {
					index++;
					arr.add(c_arr[j]);
					v[j] = true;
					if(index == 5) index = 0;
				}
			}
			
			if(arr.size() != 0) {
				if(arr.get(arr.size() - 1) != 'k') {
					System.out.println(-1);
					return;
				}
				
				count++;
			}
		}
		System.out.println(count);
	}
}
