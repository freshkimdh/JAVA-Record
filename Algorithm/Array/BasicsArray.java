package Array;
//구성 요소의 자료형이 int형인 배열

public class BasicsArray {
	public static void main(String[] args) {
	
		int[] a = new int[5];
		
		a[0] = 24;
		a[1] = 30;
		a[3] = a[0]*2;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "]:" + a[i]);
		}
	}
}
