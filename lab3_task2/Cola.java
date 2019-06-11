package task2;

public class Cola extends Juice{
	public Cola(int a){
		super(a);
		taste = "yammy";
	}
	@Override
	public void Drink(){
		System.out.println("nice!");
		volume -= 0.4;
	}
}
