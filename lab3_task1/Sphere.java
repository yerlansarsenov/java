package task1;

public class Sphere implements Shapes{
	public double radius;
	@Override
	public double volume() {
		return Math.pow(radius, 3)*4*Math.PI/3;
	}

	@Override
	public double surfaceArea() {
		return Math.pow(radius, 2)*Math.PI;
	}

}
