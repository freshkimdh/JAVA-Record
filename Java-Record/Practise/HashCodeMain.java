package Practise;

import java.util.HashSet;

// 아래를 인스턴스 수가 2가 나오도록 수정하시오.      
//HashSet<Num> set = new HashSet<>();
//set.add(new Num(7799));
//set.add(new Num(9955));
//set.add(new Num(7799));
//
//System.out.println("인스턴스 수: " + set.size());

class Num{
	
	private int num;
	
	public Num(int n) { // 생성자
		num = n;
	}
	
	//주소값을 문자열로 변환
	public String toSting() { 
		return String.valueOf(num);
	}
	
	//hashCode를 활용한 분류 기준
	public int hashCode() {
		return num % 3;
	}
	
	@Override
	//문자열을 비교하여 중복 제거
	public boolean equals(Object obj) { 
		if(num == ((Num)obj).num) {
			return true;
		} else {
			return false;
		}	
	}
}




public class HashCodeMain {

	public static void main(String[] args) {
		
		HashSet<Num> set = new HashSet<>();
		
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		
		System.out.println("인스턴스 수: " + set.size());
		
		for(Num n : set) { // 인스턴스 문자열 분류값 확인
			System.out.print(n.toSting() + '\t');
		}System.out.println();

	}

}
