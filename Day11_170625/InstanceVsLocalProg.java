class Student{
	// instance variables
	String name;
	int rollNum;
}

public class InstanceVsLocalProg {

	public static void main(String[] args) {
		// local variables
		int  item;
		byte m = 50;
		String  s = "Karthik";
		Student jaswanth = new Student();
		System.out.println(jaswanth.name);
		System.out.println(jaswanth.rollNum);
//		item = 5000;
//		System.out.println(item);
	}
}