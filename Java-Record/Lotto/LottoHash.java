package Lotto;

import java.util.HashSet;

//hasSet을 이용하여 로또 번호를 뽑아내시오.

public class LottoHash {
	public static void main(String[] args) {	
		HashSet<Integer> set = new HashSet<>();
		
		while(set.size() < 6){
			set.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(set);
		
	}
}

