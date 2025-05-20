
public class OperatorsProgram {

	public static void main(String[] args) {
		// addition, subtraction, multiplication, division , remainder
		float a = 2;
		float b = 5;
		float result = b/a;
		System.out.println(result);
		
		// Relational Operators 
		int x = 4;
		int y = 2;
		int z = 1;
		boolean comparison = (x>y) && (y>z);
		System.out.println(!comparison);
		System.out.println(!false);
		System.out.println(~12);
		System.out.println(5<<4);
		System.out.println(5>>1);
		
		int num1 = 10;
		int result_num = num1;
		
		System.out.println(num1++);
		
		num1 +=1; // num1 = num1 + 1
		num1 -=1; // num1 = num1 - 1
		System.out.println(~-5);
	}

}
