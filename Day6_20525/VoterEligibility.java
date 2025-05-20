import java.util.Scanner;

public class VoterEligibility {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		boolean testPassed = false;
		age = sc.nextInt();
		if(age>=18) {
			if (testPassed) {
				System.out.println("You are eligible for license...");
			}else {
				System.out.println("Best of luck for next time..");
			}
		}else {
			System.out.println("Not Eligible for voting..");
		}

	}

}
