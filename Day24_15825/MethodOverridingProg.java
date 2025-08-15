class OS{
	public void boot() {
		System.out.println("System is booting");
	}
	public void shutDown() {
		System.out.println("System is shutting down");
	}
}

class WINDOWS extends OS{
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

class MAC extends OS{
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

class LINUX extends OS{
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

public class MethodOverridingProg {

	public static void main(String[] args) {
		 OS os = new OS();
		 os.boot();
		 os.shutDown();
		 
		 WINDOWS windows = new WINDOWS();
		 windows.boot();
		 windows.playCS();
		 windows.shutDown();   // child can inherit parent methods
	}

}
