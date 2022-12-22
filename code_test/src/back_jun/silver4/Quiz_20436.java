package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ZOAC 3
public class Quiz_20436 {
	
	public static int[] sl_location, sr_location; 
	public static String[][] keyboard;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String sl = st.nextToken();
		String sr = st.nextToken();
		
		keyboard = new String[][] {{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"}, {"a", "s", "d", "f", "g", "h", "j", "k", "l"}, {"z", "x", "c", "v", "b", "n", "m"}};
		
		sl_location = location(sl);
		sr_location = location(sr);
		
		String str = br.readLine();
		
		int index = 0, result = 0;
		while(index < str.length()) {
			result += locationGap(str.substring(index, index + 1)) + 1;
			index += 1;
		}
		System.out.println(result);
	}
	
	public static int[] location(String s) {
		int[] answer = new int[2];
		
		for(int i = 0; i < keyboard.length; i++) {
			for(int j = 0; j < keyboard[i].length; j++) {
				if(keyboard[i][j].equals(s)) {
					answer[0] = i;
					answer[1] = j;
				}
			}
		}
		
		return answer;
	}
	
	public static int locationGap(String s) {
		int[] compared = location(s);
		
		int sl_gap = Math.abs(sl_location[0] - compared[0]) + Math.abs(sl_location[1] - compared[1]);
		int sr_gap = Math.abs(sr_location[0] - compared[0]) + Math.abs(sr_location[1] - compared[1]);
		int result = 0;
		
		if(leftHandCheck(compared[0], compared[1])) {
			result = sl_gap;
			sl_location = compared;
		} else {
			result = sr_gap;
			sr_location = compared;
		}
		
		return result;
	}
	
	public static boolean leftHandCheck(int y, int x) {
		if(y >= 0 && y <= 1 && x >= 5) return false;
		if(y == 2 && x >= 4) return false;
		return true;
	}
	
	public static boolean rightHandCheck(int y, int x) {
		if(y >= 0 && y <= 1 && x < 5) return false;
		if(y == 2 && x < 4) return false;
		return true;
	}
}