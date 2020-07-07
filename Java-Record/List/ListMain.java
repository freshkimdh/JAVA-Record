package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//ArrayList 와 LinkedList 의 차이는?
//ArrayList : 배열 기반 자료구조, 배열을 이용하여 인스턴스 저장
//LinkedLisk : 리스트 기반 자료구조, 리스트를 구성하여 인스턴스 저장



//아래의 List 객체에서 순차적 접근방법 3가지로 출력하시오.
//-list가 가지는 get
//-enhenced for
//-iterator 객체
//
//   List<String> list = new LinkedList<>();   
//   
//   // 컬렉션 인스턴스에 문자열 인스턴스 저장
//   list.add("Toy");
//   list.add("Box");
//   list.add("Robot");
public class ListMain {	
	 public static void main(String[] args) { 	       
		 List<String> list = new LinkedList<String>();   
		       
		       // 컬렉션 인스턴스에 문자열 인스턴스 저장
		 	list.add("Toy");
		    list.add("Box");
		    list.add("Robot");
		       
		    //list가 가지는 get
		    for(int i=0; i<list.size(); i++) {
		    		System.out.print(list.get(i) + " ");
		       	}System.out.println();
		       
		       //enhenced for
		    for(String i : list) {
		    		System.out.print(i + " ");
		       }System.out.println();
		       
		       //iterator 객체
		    Iterator<String> itr = list.iterator();
		    	while(itr.hasNext()) {
		    		System.out.print(itr.next() + " ");
		       }System.out.println();
		       
  }
 
}

