package back_jun.bronze3;


import java.math.BigInteger;
import java.util.Scanner;

// 부호
// BigInteger 함수를 알아야한다
public class Quiz_01247 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		for(int i = 0; i < 3; i++) {
			int n = sc.nextInt();
			BigInteger sum = new BigInteger("0");
			
			for(int j = 0; j < n; j++) {
				BigInteger num = new BigInteger(sc.next());
				sum = sum.add(num);
			}
			if(sum.compareTo(BigInteger.ZERO) == -1) System.out.println("-");
			else if(sum.compareTo(BigInteger.ZERO) == 1) System.out.println("+");
			else System.out.println("0");
		}
	}
}