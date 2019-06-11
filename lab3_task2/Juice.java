package task2;

public abstract class Juice {
	public static String taste;
	public int temp;
	public Juice(int a){
		this.temp = a;
	}
	public double volume;
	public void Drink(){
		System.out.println("uhh");
		volume -= 0.2;
	}
}
