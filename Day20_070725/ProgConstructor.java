class StudentClass{
	String name;
	Byte marks;
	
	StudentClass(){
		
	}
	
	StudentClass(String name){
		this.name = name;
	}
	
	StudentClass(byte marks){
		this.marks = marks;
	}
	
	StudentClass(String name,byte marks){
		System.out.println("Object Created");
		this.name = name;
		this.marks = marks;
	}
	
	StudentClass(byte marks,String name){
		System.out.println("Object Created");
		this.name = name;
		this.marks = marks;
	}
	
}
public class ProgConstructor {
	public static void main(String[] args) {
		StudentClass obj = new StudentClass("Jaswanth",(byte)89);
		StudentClass obj2 = new StudentClass();
		System.out.println(obj.name);
		System.out.println(obj.marks);
	}

}
