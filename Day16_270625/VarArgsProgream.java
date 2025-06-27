class Calc{
	int add(int... args) {
		int sum =0;
		for(int i=0;i<args.length;i++) {
			sum+=args[i];
		}
		return sum;
	}
}


public class VarArgsProgream {
	
	

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(10,20));
		System.out.println(c.add(10));
		System.out.println(c.add(10,20,10,20));
		System.out.println(c.add());
		

	}

}
