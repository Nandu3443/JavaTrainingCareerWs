class EARTH{
	private static EARTH e = null;
	private EARTH() {
	}
	public static EARTH getEarth() {
		if (e==null) {
			e = new EARTH();
		}
		return e;
	}
}
public class SingleTonPatternOptimizedPrg {

	public static void main(String[] args) {
		EARTH globe = EARTH.getEarth();
		EARTH world = EARTH.getEarth();
		System.out.println(globe.hashCode());
		System.out.println(world.hashCode());
	}
}

