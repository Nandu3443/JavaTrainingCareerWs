interface X{
	void d();
}

interface MyGame{
	void a();
	void b();
}

interface MySport extends MyGame,X{
	void c();
}

abstract class Part1 implements MyGame,X{
	public void d() {
		System.out.println("Hello");
	}
}

class Part2 extends Part1 implements MyGame {
	public void a() {
		System.out.println("");
	}
	public void b() {
		System.out.println("");
	}
}

public class InterfaceProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
