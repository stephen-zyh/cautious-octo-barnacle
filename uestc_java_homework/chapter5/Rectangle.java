package chapter5;

public class Rectangle extends Geometric {
	private double side1;
	private double side2;

	public Rectangle(double side1, double side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}

	public Rectangle() {
		super();
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	@Override
	double getArea() {
		return getSide1() * getSide2();
	}

	@Override
	double getPerimeter() {
		return 2 * (getSide1() + getSide2());
	}
	
	public String toString() {
		return "Rectangle's area is " + getArea() + ", perimeter is " + getPerimeter();
	}

}
