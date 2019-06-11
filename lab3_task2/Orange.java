package task2;

public class Orange extends Juice{
	public Orange(int a){
		super(a);
		taste = "scripy";
	}
	@Override
	public void Drink(){
		System.out.println("wow");
		volume -= 0.1;
	}
}
