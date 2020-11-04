package Array;

//정수를 담고 있는 배열 arr의 평균값을 return 하는 함수를 완성

public class AvgReturn {
	
	
	public double test(int[] arr) {
		
		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum/arr.length;
	}
	
	
	public static void main(String[] args) {
		
		int x [] = {1,2,3,4};
		
		AvgReturn arr = new AvgReturn();
		System.out.println(arr.test(x));				
	}
}
