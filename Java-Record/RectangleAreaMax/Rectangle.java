package RectangleAreaMax;

public class Rectangle {
	
	int width, height;
	
	Rectangle (int w, int h) {
		width = w;
		height = h;
	}
	
	int getArea() {
		return width*height;
	}
	
	public static Rectangle getMaxRec(Rectangle[] ar) {
		
		Rectangle max = ar[0];
		
		for(Rectangle rec : ar) {
			if(max.getArea()<rec.getArea()) {
				max=rec;
			}
		}
		return max;
		
		
	
	}

	


	
	
}
