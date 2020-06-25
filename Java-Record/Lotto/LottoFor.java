package Lotto;
//6개의 정수를 담는 배열을 선언후, 로또 번호 6개 생성하여 
//출력하는/프로그램을 짜시오.
//-번호생성은 Random 함수 또는 객체를 참고 할것.
//-숫자가 중복되지 않을것.
import java.util.Random;

class Lotto {
	Random ran = new Random();
	int[] num = new int[6];
	
	public void getLotto() {
		for(int i=0; i<num.length; i++) {
			num[i] = ran.nextInt(45)+1;
			System.out.println(num[i]);
			
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					System.out.println("중복숫자: " + num[j]);
					i--;
				}
			}
			
		}
	}
	
}

public class LottoFor {
	public static void main(String[] args) {
		Lotto gold = new Lotto();	
		gold.getLotto();
	}

}
