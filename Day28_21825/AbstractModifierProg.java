abstract class Athlete{
	
	public Athlete(){
		System.out.println("Constructor is called..");
	}
	abstract void whatHeDoes();
	int add() {
		return 10;
	}
	
	final void sleep() {
		System.out.println("Sleeping");
	}
}

abstract class Swimmer extends Athlete{
	
}

class Shooter extends Athlete{
	
	void whatHeDoes() {
		System.out.println("He shoots");
	}
//	final void sleep() {
//	}
}
public class AbstractModifierProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Athlete();
		Athlete shooter = new Shooter();
	}

}
