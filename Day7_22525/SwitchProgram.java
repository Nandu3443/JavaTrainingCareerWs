import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {
		// calculator using switch cases
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers a,b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("What operation do u want +,-,*,/");
		String operation = sc.next();
		int result = 0;
		switch (operation) {
		case "+":
			result = a + b;
			System.out.println("Addition result:" + result);
			break;
		case "-":
			result = a - b;
			System.out.println("Subtraction result:" + result);
			break;
		case "*":
			result = a * b;
			System.out.println("Subtraction result:" + result);
			break;
		case "/":
			result = a / b;
			System.out.println("Subtraction result:" + result);
			break;
		default:
			System.out.println("Provide proper operation..");
		}

	}

}
