package chapter5;

public abstract class Geometric {
	public String color;
	public boolean filled;

	public Geometric() {
		super();
	}

	public Geometric(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	abstract double getArea();

	abstract double getPerimeter();

	@Override
	public String toString() {
		return "Circle";
	}
}
