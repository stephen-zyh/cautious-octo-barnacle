package chapter5;

public class Circle extends Geometric {

	double radius;

	public Circle() {
		super();
		radius = 0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	double getPerimeter() {
		return Math.PI * radius * 2;
	}

	public String toString() {
		return "Circle's area is " + getArea() + ", perimeter is " + getPerimeter();
	}

}
