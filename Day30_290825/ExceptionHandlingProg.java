import java.util.Scanner;

public class ExceptionHandlingProg {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a, b values:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			try {
				System.out.println(a/b);
			}catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println("B value cannot be zero");
			}
			System.out.println("Program completed...");
	}
}
