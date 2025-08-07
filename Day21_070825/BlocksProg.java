class AlphaBlocks{
	{
		System.out.println("Instance Block - 1");
	}
	static {
		System.out.println("Static Block -1");
	}
	
	{
		System.out.println("Instance Block -2 ");
	}
	
	static {
		System.out.println("Static Block -2");
	}
}
public class BlocksProg {
	{
		System.out.println("Main instance Block");
	}
	public static void main(String[] args) {
		AlphaBlocks obj1 = new AlphaBlocks();
		AlphaBlocks obj2 = new AlphaBlocks();
	}
	static {
		System.out.println("Main static Block");
	}
}
