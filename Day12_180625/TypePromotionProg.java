class Calculator{
	
	double add(float a,int b) {
		double result = a+b;
		return result;
	}
	double add(int a,float b) {
		double result = a+b;
		return result;
	}
}
public class TypePromotionProg {

	public static void main(String[] args) {
		Calculator obj= new Calculator();
		int a = 5;
		int b = 10;
//		obj.add(5.0f, 10);
//		System.out.println(obj.add(5, 10));
	}
}
