import java.util.Scanner;

public class ConditionalProg {

	public static void main(String[] args) {
		int savings = 5000;
		System.out.println("Enter amount to withdraw:");
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		
		if (withdraw<0) {
			System.out.println("Provide amount greater than 0");
		}
		else if (withdraw<savings) {
			System.out.print("Collecting Money..");
		}else {
			System.out.print("In-sufficient balance");
		}

	}

}
