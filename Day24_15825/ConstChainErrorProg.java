class ZetaA{
	ZetaA(int x){
		System.out.println(x);
	}
}

class ZetaB extends ZetaA{
	ZetaB(int x){
		//super(); // it throws error
		super(x); // it is developer responsibility to add super() call 
	}
}
public class ConstChainErrorProg {

	public static void main(String[] args) {
		new ZetaB(10);
	}
}
