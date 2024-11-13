package in.co.Methodoveriding;

public class Triangle extends Shape {
	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
