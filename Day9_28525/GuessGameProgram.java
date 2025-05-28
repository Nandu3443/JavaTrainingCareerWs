import java.util.Scanner;

class Guesser{
	int gNum;
	int guessNumber(){
		System.out.println("Guesser guess the number");
		Scanner sc = new Scanner(System.in);
		gNum = sc.nextInt();
		return gNum;
	}
}

class Player{
	int pNum;
	int playerGNumber() {
		System.out.println("Player guess the number");
		Scanner sc = new Scanner(System.in);
		pNum = sc.nextInt();
		return pNum;
	}
}

class Umpire{
	int numFromG;
	int numFromP1;
	int numFromP2;
	int numFromP3;
	
	void collectNumFromG(){
		Guesser ali  = new Guesser();
		numFromG = ali.guessNumber();
	}
	
	void collectNumFromPlayer() {
		Player priya = new Player();
		Player jaswanth= new Player();
		Player srikar= new Player();
		numFromP1 = priya.playerGNumber();
		numFromP2 = jaswanth.playerGNumber();
		numFromP3 = srikar.playerGNumber();
	}
	
	void compare() {
		if (numFromG == numFromP1) {
			System.out.println("Player 1 wins");
		}
		if(numFromG == numFromP2) {
			System.out.println("Player 2 wins");
		}
		if(numFromG == numFromP3) {
			System.out.println("Player 3 wins");
		}
		if(numFromG!=numFromP1 && numFromG != numFromP2 && numFromG != numFromP3 ) {
			System.out.println("No one wins,play Again!..");
		}
	}
}


public class GuessGameProgram {
	public static void main(String[] args) {
		Umpire govardhan = new Umpire();
		govardhan.collectNumFromG();
		govardhan.collectNumFromPlayer();
		govardhan.compare();
	}
}
