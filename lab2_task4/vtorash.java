package problem4;

public class vtorash extends Student{
	public static String proga = "java";
	public vtorash(String name) {
		super(name);
	}
	@Override 
	public String getName(){
		return "vtorash " + super.getName();
	}
	@Override
	public String getProga(){
		return proga;
	}
}
