class Indian{
	String name;
	byte age;
	static String primeMinister;
}
public class StaticVarProg {

	public static void main(String[] args) {
		Indian person1 = new Indian();
		Indian person2 = new Indian();
		person1.name = "Alex";
		person1.age = 24;
		person2.name = "Bob";
		person2.age = 25;
		person1.primeMinister = "Modi";
		System.out.println(person1.name);
		System.out.println(person2.name);
		System.out.println(person2.primeMinister);
		Indian person3 = new Indian();
		System.out.println(person3.primeMinister);
		Indian.primeMinister = "Modiji";
		System.out.println(person1.primeMinister);
		System.out.println(person2.primeMinister);
	}

}
