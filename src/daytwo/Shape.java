package daytwo;

public interface Shape {
	
	void calculateArea();
	void display();

}

class Rectangle implements Shape {
	
	double width;
	double height;
	
	@Override
	public void calculateArea() {
		double area = width * height;
		
	}

	@Override
	public void display() {
		Rectangle rec = new Rectangle();
		String className = rec.getClass().getSimpleName();
		System.out.println(className);
	}
	
}

class Circle implements Shape {
	
	double radius;

	@Override
	public void calculateArea() {
		double pi = Math.PI;
		double area = pi * (radius*radius);
		
	}

	@Override
	public void display() {
		Circle cir = new Circle();
		String className = cir.getClass().getSimpleName();
		System.out.println(className);
	}
	
}

class Triangle implements Shape {
	
	double base;
	double height;

	@Override
	public void calculateArea() {
		double area = (base * height)/2;
		
	}

	@Override
	public void display() {
		Triangle tri = new Triangle();
		String className = tri.getClass().getSimpleName();
		System.out.println(className);
	}
	
}