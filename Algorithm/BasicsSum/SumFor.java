package BasicsSum;
//1부터 ~ n까지의 합을 구하시오.

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 n을 입력하세요. ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			
			sum = sum+i;
			//sum += i;
			
		}System.out.println(n + "까지의 합은 " + sum + " 입니다.");
		

	}

}
