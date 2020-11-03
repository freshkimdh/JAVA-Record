package practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//hasSet을 이용하여 로또 번호를 뽑아내시오.

//아래의 List 객체에서 순차적 접근방법 3가지로 출력하시오.

public class Test {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(; set.size() < 6;) {
			set.add((int) (Math.random() * 45) + 1);
		}System.out.println(set);
		
	}

}
