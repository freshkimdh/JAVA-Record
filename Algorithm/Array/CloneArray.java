package Array;
//배열을 복제

public class CloneArray {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		
		b[3] = 1;
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		for(int j=0; j<b.length; j++) {
			System.out.print(b[j]);
		}
		

	}

}
