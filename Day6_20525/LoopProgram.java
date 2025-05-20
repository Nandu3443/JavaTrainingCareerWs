import java.util.Scanner;

public class LoopProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for(initialization;condition;updation) {
//			body
//		}
//		i++ -> i = i+1
		System.out.println("Checking the loop..");
		for (int i =0;i<3;i++) {
			System.out.println("Hi, Hello how are you...");
		}
		for(int i=0;i>-3;i=i-1) {
			System.out.println("Hi, Hello how are you..");
		}
		
		int count = 0;
		
		while(count<3) {
			System.out.println("While blocking is executing..");
			count = count +1;
		}
		boolean isStillFetching = false;
		
		count = 0;
		while(isStillFetching) {
			// logic to database to pull data
			System.out.println(count);
			System.out.println("Whether data received for this batch");
			String userInput = sc.next();
//			System.out.printf("userInput is %s\n",userInput);
			if (userInput.equals("yes")){
				System.out.println("Data is fetched from database");
				count++;
			}
			if (count==5) {
				isStillFetching = false;
			}
		}
		
		count = 0;
		do {
			System.out.println(count);
			System.out.println("Whether data received for this batch from do-while");
			String userInput = sc.next();
//			System.out.printf("userInput is %s\n",userInput);
			if (userInput.equals("yes")){
				System.out.println("Data is fetched from database");
				count++;
			}
			if (count==5) {
				isStillFetching = false;
			}
		}while(isStillFetching);
		
		System.out.println("Loops execution done..");
	}

}
