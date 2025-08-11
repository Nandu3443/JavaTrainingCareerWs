class AlphaA{
	int y = 10;
	void myMethod() {
		System.out.println(y);	
	}
}

class AlphaB{
	int x;
	static int y = 20;
	static void yourMethod() {
		System.out.println(y);
	}
	static {
//		System.out.println(x);
	}
}

public class StaticMethodProgram {

	public static void main(String[] args) {
			AlphaA objA= new AlphaA();
		    objA.myMethod();
		    AlphaB.yourMethod();
		    System.out.println(AlphaB.y);
	}

}
