package chapter5;

public class TestGeometric {

	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.err.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		System.out.println(circle.toString());

		Rectangle rectangle = new Rectangle(5, 9);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		System.out.println(rectangle.toString());

		Triangle triangle = new Triangle(12, 5, 13);
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
		System.out.println(triangle.toString());

	}

}
