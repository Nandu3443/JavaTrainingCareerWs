
class Car{
	String brand;
	String model;
}

public class MemoryDeallocationProg {
	static void add() {
		int a =10;
		int b = 20;
		System.out.println(a+b);
	}
	
	static Car createCar() {
		Car audi = new Car();
		return audi;
	}

	public static void main(String[] args) {
		add();
		Car obj = createCar();
		System.out.print(obj);
	}
}
