package Array;

import java.util.Random;
import java.util.Scanner;

//사람의 키를 값으로, 배열 요소의 최댓값을 나타내시오(Random, Scanner 활용)

public class MaxRandomArray {

	static int maxOf(int[] a) {
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("키의 최대값을 구하시오.");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i=0; i<num; i++) {
			height[i] = 100+ran.nextInt(90)+1;
			System.out.println("height["+ i +"]: " + height[i]);
		}
		
		System.out.println("최대값은 " + maxOf(height) + " 입니다.");
	}
}
