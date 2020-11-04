package Array;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴시키는 함수

public class ReverseArray2 {
	public static void main(String[] args) {
		
		int slist[] = {1,2,3,4,5};
		System.out.println("기존의 배열 순서");
		
		for(int i=0; i<slist.length; i++) {
			System.out.print(slist[i] + " ");
		}
		
		System.out.println();
		System.out.println("역순된 배열");
		for(int i=slist.length-1; 0<=i; i--) {
			System.out.print(slist[i] + " ");
		}		
	}
}
