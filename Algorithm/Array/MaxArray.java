package Array;

import java.util.Scanner;

//사람의 키를 값으로, 배열 요소의 최댓값을 나타내시오(Scanner 활용)

public class MaxArray {
	
	static int maxOf(int[] a) {
		
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		} //for문	
		return max;
	}//max()	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("height[" + i + "] ");
			height[i] = sc.nextInt();
		}
		System.out.println("최댓값은 " + maxOf(height) + " 입니다.");				
	}
}


