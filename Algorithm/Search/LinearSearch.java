package Search;

//선형 검색 (sequential(linear) Search))
//요소수가 n인 배열 a에서 key 와 같은 요소를 선형 검색
//요소의 수는 랜덤으로 나열해라.


import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
   
   static int seqSearch(int[] a, int n, int key) { //선형검색 함수
      
      for(int i=0; i<n; i++){
         if(a[i] == key)
            return i;
      }return -1;
      
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random ran = new Random();
      
      System.out.print("요소 수: ");
      int num = sc.nextInt(); // 5 입력
      int[] x = new int[num]; 
      
      for(int i=0; i<num; i++) {
         x[i] = ran.nextInt(100);
         System.out.println("x[" + i + "]: " + x[i]);
      }
      
      System.out.print("검색할 값: ");
      int ky = sc.nextInt(); //검색 값 30
      
      int idx = seqSearch(x, num, ky); //int[5], 5, 30 
      
      if(idx == -1) {
         System.out.println("그 값의 요소가 없습니다.");
      }else {
         System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
      }
      
   }

}