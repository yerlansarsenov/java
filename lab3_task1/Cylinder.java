package task1;

public class Cylinder implements Shapes{
	public double height;
	public double radius;
	@Override
	public double volume() {
		return height*radius;
	}

	@Override
	public double surfaceArea() {
		return radius*radius*Math.PI;
	}
	
}
