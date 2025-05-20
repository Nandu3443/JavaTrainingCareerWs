import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Umpire guess the number:");
		int umpireGuessNum = sc.nextInt();
		System.out.println("Players P1,P2,P3 guess the number:");
		Scanner sc2= new Scanner(System.in);
		int playerGuessedNum1 = sc.nextInt();
		int playerGuessedNum2 = sc.nextInt();
		int playerGuessedNum3 = sc.nextInt();
		
		if (playerGuessedNum1 == umpireGuessNum) {
			System.out.println("Player 1 won the guessing game..");
		}else if(playerGuessedNum2 == umpireGuessNum) {
			System.out.println("Player 2 won the guessing game..");
		}else if(playerGuessedNum3 == umpireGuessNum) {
			System.out.println("Player 3 won the guessing game..");
		}else {
			System.out.println("Replay the game..");
		}
		
//		System.out.println("Player 1 won the guessing game..");
//		System.out.println("Player 2 won the guessing game..");
//		System.out.println("Player 3 won the guessing game..");
//		System.out.println("Replay the game..");
		

	}

}
