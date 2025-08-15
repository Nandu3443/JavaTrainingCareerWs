class Os{
	public void boot() {
		System.out.println("System is booting");
	}
	public void shutDown() {
		System.out.println("System is shutting down");
	}
}

class Windows extends Os{
	public void playCS() {
		System.out.println("Enjoying headshots");
	}
}

class Mac extends Os{
	public void videoEdit() {
		System.out.println("Editing ShortFilm..");
	}
}

class Linux extends Os{
	public void writeCode() {
		System.out.println("Writing java program");
	}
}

public class OsProg {

	public static void main(String[] args) {
		 Os os = new Os();
		 os.boot();
		 os.shutDown();
//		 os.playCS();    // parent can't inherit child methods
		 
		 Windows windows = new Windows();
		 windows.boot();
		 windows.playCS();
		 windows.shutDown();   // child can inherit parent methods
	}

}
