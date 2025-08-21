class Earth{
	private static Earth e = new Earth();
	private Earth() {
	}
	public static Earth getEarth() {
		return e;
	}
}

public class SingleTonPatternProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth globe = Earth.getEarth();
		Earth world = Earth.getEarth();
		System.out.println(globe.hashCode());
		System.out.println(world.hashCode());
	}
}
