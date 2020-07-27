package Array;

//요소 수가 n인 배열 a에서 key와 같은 요소를 이진 검색하여라.

import java.util.Scanner;

public class BinarySearch {

	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n-1; // 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl+pr)/2; // 중앙 요소 인덱스
			
			if(a[pc] == key) { 
				return pc; // 검색 성공
			}else if (a[pc] < key){ 
				pl = pc + 1; // 검색 범위를 뒤쪽으로 좁힙
			}else if (a[pc] > key) { 
				pr = pc -1; // 검색 범위를 앞쪽으로 좁힙
			}	
			
		}while (pl <= pr);
		return -1;
	}
	
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("요소 수");
    	int num = sc.nextInt();
    	int[] x = new int[num];
    	
    	System.out.println("오름차순으로 입력하세요.");
    	
    	System.out.print("x[0]: ");
    	x[0] = sc.nextInt();
    	
    	//오름차순
    	for(int i=1; i < num; i++) {
    		do {
    			System.out.print("x[" + i + "]: ");
    			x[i] = sc.nextInt();
    		
    		}while(x[i] < x[i-1]); // 바로 앞 요소보다 작으면 다시 입력
    	}
    	
    	System.out.print("검색할 값:");
    	int ky = sc.nextInt();
    	
    	int idx = binSearch(x, num, ky); //배열에서 키 값이 ky 요소 검색
    	
    	if(idx == -1)
    		System.out.println("그 값의 요소는 없습니다.");
    	else
    		System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		
	}
    	
}