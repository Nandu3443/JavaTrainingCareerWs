class AlphaaA{
	int x =10;
	
	AlphaaA(){
		System.out.println("Parent constructor is called..");
	}
}

class AlphaaB extends AlphaaA{
	int x = 999;
	
	void display() {
		System.out.println(super.x);
		System.out.println(this.x);
	}
	
	AlphaaB(){
		super();
		System.out.println("Child constructor is called..");
	}
	
}


public class InheritanceRule6Prog {

	public static void main(String[] args) {
		AlphaaB obj = new AlphaaB();
		System.out.println(obj.x);
		obj.display();
	}

}
