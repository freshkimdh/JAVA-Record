package Generic;
//4.아래가 호출되도록 BoxFactory 클래스를 만드시오.
//Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
//Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
//(제네릭 활용) - 데이터 타입을 외부에서 설정하여 출력하는 것.

class Box <T> {   
 private T ob;
 
 public void set(T o) {
    ob = o;
 }
 
 public T get() {
    return ob;
 }
}

class BoxFactory {
 
 public static <T> Box<T> makeBox(T o) {
    Box<T> box = new Box<T>();
    box.set(o);
    return box;
 }
}

public class BoxGeneric {

 public static void main(String[] args) { 
    Box<String> sBox = BoxFactory.makeBox("sweet"); // 함수명 앞에 <String> 생략
    System.out.println(sBox.get());
    
    Box<Double> dBox = BoxFactory.makeBox(7.59); // 함수명 앞에 <Double> 생략
    System.out.println(dBox.get());         
 }
}