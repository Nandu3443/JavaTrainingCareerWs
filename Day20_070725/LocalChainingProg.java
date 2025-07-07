class StudentAlpha{
	private String name;
	private int rollNo;
	private byte marks;
	
	StudentAlpha(String name, int rollNo,byte marks) {
		this(rollNo,marks);
		System.out.println("Constructor 1 called");
		this.name = name;
		System.out.println("Name assigned..");
		
	}
	StudentAlpha(int rollNo, byte marks) {
		this(marks);
		System.out.println("Constructor 2 called");
		this.rollNo = rollNo;
		System.out.println("Roll number Assigned..");
	}
	StudentAlpha(byte marks){
		this();
		System.out.println("Constructor 3 called");
		this.marks = marks;
		System.out.println("Marks assigned");
	}
	StudentAlpha(){
		System.out.println("Object created..");
	}
}


public class LocalChainingProg {

	public static void main(String[] args) {
		StudentAlpha obj = new StudentAlpha("Alex",101,(byte)70);
	}

}
