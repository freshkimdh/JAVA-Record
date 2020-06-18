package RectangleAreaMax;

import java.util.Scanner;

//아래를 프로그래밍 하시오.
//- Rectangle 배열 4개를 만든후 스캐너 객체로 가로와 세로를 입력하여 
//4개의 객체를 배열에 할당한다 
//- 해당 배열중 넓이가 최대값을 찾아서 리턴
//
//Rectangle[] rec = new Rectangle[3];
//........
//Rectangle maxRec = getMaxRec(rec) 
//s.o.p("최대사각형 넓이는" +maxRec.getArea())

public class RecMain {

	public static void main(String[] args) {
		
	    Rectangle[] arrRec = new Rectangle[3];
	    
	    Scanner sc = new Scanner(System.in);
	    
	    for(int i=0; i<arrRec.length; i++) {
	    	System.out.print("가로 세로를 입력하세요. ");
	    	arrRec[i] = new Rectangle(sc.nextInt(), sc.nextInt());
	    }
	   
	    
		Rectangle max = Rectangle.getMaxRec(arrRec);	
		System.out.println("최대사각형 넓이는 " + max.getArea());
		
	}
}
