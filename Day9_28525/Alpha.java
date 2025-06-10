class Developer{
	String name;
	int empId;
	double salary;
}

class CalculationValues{
	static int a =0;
	static int b =0;
}
public class Alpha {
	public static void addition() {
		int result = CalculationValues.a+CalculationValues.b;
	}
		
	public static void main(String[] args) {
		Developer ali = new Developer();
		ali.name = "Ibrahim Ali";
		ali.empId = 20001;
		ali.salary = 100000;
		int a = 10;
		System.out.println(ali);
		CalculationValues.a = 10;
		CalculationValues.b = 20;
		addition();
	}
}
