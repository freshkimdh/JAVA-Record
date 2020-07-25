package Array;


import java.util.Random;
import java.util.Scanner;

//배열 요소에 랜덤으로 값을 저장 후, 역순으로 정렬 합니다.

public class ReverseArray {
	
	static void swap(int[] a, int x1, int x2) {
		int t = a[x1]; // t = 0
		a[x1] = a[x2]; // 
		a[x2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length -i -1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("요소 수: ");
		int num = sc.nextInt();
				
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			
			x[i] = ran.nextInt(100); // 0부터 99까지
			System.out.println("x["+i+"]: " + x[i]);	
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i =0; i<num; i++) {
			System.out.println("x[" + i + "]" + x[i]);
		}
		
	}

}
