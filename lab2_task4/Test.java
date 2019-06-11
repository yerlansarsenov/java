package problem4;

public class Test {
	static pervash p = new pervash("naruto");
	static vtorash v = new vtorash("kakashi");
	public static void main(String[] args){
		Student s = p;
		System.out.println(s.getName());
		s = v;
		System.out.println(s.getName());
		System.out.println(p.getProga());
		System.out.println(v.getProga());
	}
}

