class Heart{
	int hearBeats = 62;
}

class CAr{
	String brand = "Nano";
	String color = "White";
	int topSpeed = 90;
}

class Human{
	Heart myHeart;
	Human(){
		myHeart = new Heart();
	}
	
	void displayCarDetails(CAr myCar) {
		System.out.println(myCar.brand);
		System.out.println(myCar.color);
		System.out.println(myCar.topSpeed);
	}
	
	
	
}

public class HasARelationProgExample {

	public static void main(String[] args) {
		Human bob = new Human();
		System.out.println(bob.myHeart.hearBeats);
		CAr nano = new CAr();
		bob.displayCarDetails(nano);
	}
}
