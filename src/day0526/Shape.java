package day0526;

class Point{
	
	int x;
	int y;
	
}

//상속
//class Circle extends Point{
//	int r;
//}

class Circle{
	Point p = new Point();
	int r;
}

public class Shape{
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println(c.toString());
		
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		
		System.out.println(c1);
		
		
		
//		상속
//		c.x = 10;
//		c.y = 20;
//		c.r = 15;
//		
//		System.err.println("c.x = %d\n", c.x);
//		System.err.println("c.y = %d\n", c.y);
//		System.err.println("c.r = %d\n", c.r);
		
//		포함
//		c.p.x = 10;
//		c.p.y = 20;
//		c.r = 15;
//		
//		System.out.printf("c.p.x = %d\n", c.p.x);
//		System.out.printf("c.p.y = %d\n", c.p.y);
//		System.out.printf("c.r = %d\n", c.r);
		
	}
}
