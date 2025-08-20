import java.util.Scanner;

class CAR{
	public void start() {
		System.out.println("Car is starting");
	}
	public void run() {
		System.out.println("Car is running");
	}
	public void stop() {
		System.out.println("Car is stop");
	}
}
class Audi extends CAR{
	public void start() {
		System.out.println("Audi is starting");
	}
	public void run() {
		System.out.println("Audi is running");
	}
	public void stop() {
		System.out.println("Audi is stop");
	}
}

class BMW extends CAR{
	public void start() {
		System.out.println("BMW is starting");
	}
	public void run() {
		System.out.println("BMW is running");
	}
	public void stop() {
		System.out.println("BMW is stop");
	}
}

class Nano extends CAR{
	public void start() {
		System.out.println("Nano is starting");
	}
	public void run() {
		System.out.println("Nano is running");
	}
	public void stop() {
		System.out.println("Nano is stop");
	}
}

class Factory{
	public static CAR getCar(String input) {
		if(input.equalsIgnoreCase("bmw")) {
			return new BMW();
		}else if(input.equalsIgnoreCase("audi")) {
			return new Audi();
		}else if(input.equalsIgnoreCase("nano")) {
			return new Nano();
		}else {
			return null;
		}
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice");
		String choice = sc.next();
		CAR myCar = Factory.getCar(choice);
		if(myCar!=null) {
			myCar.start();
			myCar.run();
			myCar.stop();
		}else {
			System.out.println("Invalid input");
		}

	}

}
