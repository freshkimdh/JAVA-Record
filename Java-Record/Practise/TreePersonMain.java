package Practise;

import java.util.Comparator;
import java.util.TreeSet;



//아래를 구현 시키기 위한 Person 객체를 작성하시오.
//TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
//   tree.add(new Person("YOON", 37));
//   tree.add(new Person("HONG", 53));
//   tree.add(new Person("PARK", 22));
//
//   for(Person p : tree)
//      System.out.println(p);


//import java.lang 에서 인터페이스 가져와서 사용
class Person implements Comparable<Person> { 
	String name;
	int age;
	
	public Person(String name, int age) { // 생성자 초기화
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { // 주소값을 문자열로 Override
		return name + " : " + age;
	}
	
	@Override
	//음수 or 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.
	public int compareTo(Person p) { // compareTo 함수 사용
		return this.age - p.age; // 
	}
}

//Comparator 인터페이스로 정렬기준을 다시 정의 할 수 있음. 숫자 or 문자열 길이 등.
class PersonComparator implements Comparator<Person>{ 
	public int compare(Person p1, Person p2) {
		return p2.age - p1.age;
	}
}


public class TreePersonMain {
	public static void main(String[] args) {
		
		TreeSet<Person> tree = new TreeSet<>(new PersonComparator()); // new PesonComparator() 추가
		tree.add(new Person("YOON", 22));
	  	tree.add(new Person("HONG", 37));
	  	tree.add(new Person("PARK", 53));
	
	   for(Person p : tree) { //TreeSet 입력된 값 출력
	      System.out.println(p.toString()); // .toString() 생략 가능
	   }
	}
}
