package Circle;
//Circle c1 = new Circle(6);
//Circle c2 = new Circle(7);
//Circle c3 = new Circle(8);
//
//Circle max = Circle.maxCircle(c1,c2,c3);
//
//Sysout.out.println(max.radius)
//======================
//출력 : 8
public class Circle {
	
	double radius;
	
	Circle (int r) {
		radius = r;
	}
	
	public static Circle maxCircle(Circle a, Circle b, Circle c) {
		if(a.radius>b.radius && a.radius>c.radius) {
			return a;
		} else if (b.radius>a.radius && b.radius>c.radius) {
			return b;
		} else {
			return c;
		}
			
	}

}
