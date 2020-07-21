package MaxResult;
// 4개 값의 최댓값을 구하는 max 메소드를 작성하세요.
// static int max(int a, int b, int c, int d)

public class Max_2 {
	
	static int max(int a, int b, int c, int d) {
		
		int max = a;
		
		if(b>max) 
			max=b;
		if(c>max) 
			max=c;
		if(d>max)
			max=d;
		
		return max;
		}
	
	public static void main(String[] args) {
		System.out.println("max(1,2,3,4) = " + max(1,2,3,4));
		System.out.println("max(1,2,4,3) = " + max(1,2,4,3));
		System.out.println("max(1,3,2,4) = " + max(1,3,2,4));
		System.out.println("max(1,3,4,2) = " + max(1,3,4,2));
		System.out.println("max(4,1,2,3) = " + max(4,1,2,3));
	}

}
