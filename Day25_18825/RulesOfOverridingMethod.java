class ParentGamma{
	public int add(int a,int b) {
		return a+b;
	}
	
	public Object play() {
		return new Parent();
	}
}

class ChildGamma extends ParentGamma{
	public int add(int a,int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		return a+b;
	}
	
	public String play() {
		return new ChildGamma().toString();
	}
}

class kidGamma extends ParentGamma{
	
}



public class RulesOfOverridingMethod {

	public static void main(String[] args) {
		
	}

}
