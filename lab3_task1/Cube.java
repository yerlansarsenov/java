package task1;

public class Cube implements Shapes{
	public double length;
	@Override
	public double volume() {
		return Math.pow(length, 3);
	}

	@Override
	public double surfaceArea() {
		return Math.pow(length, 3);
	}
	
}
