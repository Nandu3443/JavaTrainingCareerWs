class Calculate{
	int add(int a,int b) {
		int result = a+b;
		return result;
	}
	int add(int a ,int b, int c) {
		int result = a+b+c;
		return result;
	}
	double add(double a,double b) {
		double result = a+b;
		return result;
	}
	
	int add(int a ,double b) {
		int result = a+(int)b;
		return result;
	}
	
	int add(double b, int a) {
		int result = a+(int)b;
		return result;
	}
	
	double add(double a,double b,int c) {
			double result = a+b+c;
			return result;
	}
	double add(int a,double b, double c) {
		double d = a+b+c;
		return d;
	}
}


public class MethodOverloadingProg {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Calculate calc = new Calculate();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(10, 20,30));
		System.out.println(calc.add(a,b));
	}

}
