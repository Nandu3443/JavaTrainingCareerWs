class AlphaStatic{
	static int a = 10;
	int b = 20;
	{
		System.out.println("Instance Block-1 "+b);
	}
	
	static {
		int z =10; //local variables
		System.out.println("Static Block-1 " +a);
	}
	AlphaStatic(){
		System.out.println("Constructor -1");
	}
	static {
		System.out.println("Static Block-2");
	}
	AlphaStatic(int x){
		System.out.println("Constructor printing "+x);
	}
	{
		System.out.println("Instance Block-2");
	}
}
public class WholeStaticConcept {

	public static void main(String[] args) {
		System.out.println("Main Method WholeStaticConcept called..");
		new AlphaStatic(10);
	}

}
