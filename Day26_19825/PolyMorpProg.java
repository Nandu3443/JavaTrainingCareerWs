import java.util.Scanner;

class OperatingSystem{
	public void boot() {
		System.out.println("System is booting");
	}
	public void shutDown() {
		System.out.println("System is shutting down");
	}
}

class WINDOWs extends OperatingSystem{
	public void boot() {
		System.out.println("Windows System is booting");
	}
	public void shutDown() {
		System.out.println("Windows System is shutting down");
	}
	public void playCS() {
		System.out.println("Enjoying headshots");
	}
}

class MAc extends OperatingSystem{
	public void boot() {
		System.out.println("MAC System is booting");
	}
	public void shutDown() {
		System.out.println("MAC System is shutting down");
	}
	public void videoEdit() {
		System.out.println("Editing ShortFilm..");
	}
}

class LINUx extends OperatingSystem{
	public void boot() {
		System.out.println("LINUX System is booting");
	}
	public void shutDown() {
		System.out.println("LINUX System is shutting down");
	}
	public void writeCode() {
		System.out.println("Writing java program");
	}
}



public class PolyMorpProg {

	public static void main(String[] args) {
		Scanner sc	= new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		OperatingSystem myOs = null;
		switch (choice) {
		case 1:
			myOs =  new WINDOWs();
			break;
		case 2:
			myOs = new MAc();
			break;
		case 3:
			myOs = new LINUx();
			break;

		default:
			System.out.println("Enter a valid input");
			break;
		}
		myOs.boot();
		myOs.shutDown();
		WINDOWs windows= ((WINDOWs)myOs);
		windows.playCS();
	}
}
