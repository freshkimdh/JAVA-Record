package Circle;

public class MainCir {

	public static void main(String[] args) {

		Circle c1 = new Circle(6);
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(8);
		
		Circle max = Circle.maxCircle(c1,c2,c3);
		
		System.out.println(max.radius);

	}

}
