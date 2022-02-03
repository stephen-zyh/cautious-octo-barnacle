package chapter5;

public class Triangle extends Geometric {
	private double side1, side2, side3;

	public Triangle() {
		super();
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public boolean isTriangle() {
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			return true;
		}
		return false;
	}

	@Override
	double getArea() {
		if (isTriangle()) {
			double p = (side1 + side2 + side3) / 2;
			return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		}
		return -1;
	}

	@Override
	double getPerimeter() {
		if (isTriangle()) {
			return side1 + side2 + side3;
		}
		return -1;
	}

	public String toString() {
		return "The value of the three edge is " + side1 + ", " + side2 + ", " + side3 + ".";
	}
}
