package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 애너그램 만들기
public class Quiz_01919 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		
		for(int i = 0; i < str1.length(); i++) {
			arr1.add(str1.substring(i, i + 1));
		}
		
		for(int i = 0; i < str2.length(); i++) {
			arr2.add(str2.substring(i, i + 1));
		}
		
		for(int i = 0; i < arr1.size(); i++) {
			for(int j = 0; j < arr2.size(); j++) {
				if(arr1.get(i).equals(arr2.get(j)) && !arr1.get(i).isBlank()) {
					arr1.set(i, "");
					arr2.set(j, "");
					break;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < arr1.size(); i++) {
			if(!arr1.get(i).isEmpty()) cnt++;
		}
		for(int i = 0; i < arr2.size(); i++) {
			if(!arr2.get(i).isEmpty()) cnt++;
		}
		
		System.out.println(cnt);
	}
}
