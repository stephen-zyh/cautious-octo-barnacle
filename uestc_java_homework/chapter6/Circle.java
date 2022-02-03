package chapter6;

public class Circle {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws InvalidRadiusException {
		this.radius = radius;
		if (radius < 0) {
			throw new InvalidRadiusException("The radius can not below 0!");
		}
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		try {
			circle.setRadius(-2);
		} catch (InvalidRadiusException e) {
			e.printStackTrace();
		}
	}
}
