import java.util.Scanner;

public class BreakContinueUsage {

	public static void main(String[] args) {
		// 0 ,1 ,2,3,4,5,6,7,8,9,10
		for (int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				continue;
//				break;
			}
			System.out.println("i value "+i);
		}
		
		int UmpireGuessNumber = 10;
		Scanner sc = new Scanner(System.in);
		//infinite loop
		while(true) {
			System.out.println("Guess the number...");
			int guessNumber = sc.nextInt();
			if (guessNumber == UmpireGuessNumber) {
				break;
			}else {
				System.out.println("Retry again....");
			}
		}
		System.out.println("Execution done...");
	}

}
