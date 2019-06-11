package problem4;

public class pervash extends Student{
	public String proga = "c++";
	public pervash(String name) {
		super(name);
	}
	@Override
	public String getName(){
		return "pervash " + super.getName();
	}
	@Override
	public String getProga(){
		return proga;
	}
}
