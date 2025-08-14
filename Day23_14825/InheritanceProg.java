class A{
	private int x = 10;
	int y = 10;
	
	private void add() {
		
	}
	
//	A(int x){
//		this.x = x;
//	}
}

class B extends A{
	int y = 20;
}

public class InheritanceProg {

	public static void main(String[] args) {
		 B obj= new B();
//		 System.out.println(obj.x);
		 System.out.println(obj.y);
//		 obj.add();

	}

}
