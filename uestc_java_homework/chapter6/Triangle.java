package chapter6;

public class Triangle {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			Triangle triangle = new Triangle(23, 5, 7);
		} catch (IllegalTriangleException e) {
			e.printStackTrace();
		}

	}
	
	double a, b, c;

	public Triangle(double a, double b, double c) throws IllegalTriangleException {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		if(a + b <= c || b + c <= a || c + a <= b) {
			throw new IllegalTriangleException("Illegal triangle!");
		}
	}

	public Triangle() {
		super();
	}
	

}
