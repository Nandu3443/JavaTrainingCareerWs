
class GreatGrandFather{
	public GreatGrandFather(){
		System.out.println("GreatGrandFather Born");
	}
	
}

class GrandFather extends GreatGrandFather{
	public GrandFather() {
		System.out.println("GrandFather Born");
	}
}

class Father extends GrandFather{
	public Father() {
		System.out.println("Father Born");
	}
}

class AlphaChild extends Father{
	public AlphaChild() {
		System.out.println("Child Born");
	}
}


public class MultilevelConstChainingProg {

	public static void main(String[] args) {
			new AlphaChild();
	}

}
