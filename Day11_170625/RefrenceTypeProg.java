class Developers{
	String name;
	int empId;
	double salary;
}
public class RefrenceTypeProg {

	public static void main(String[] args) {
		Developers	karthik	= new Developers();
		karthik.name = "Karthik";
		karthik.empId = 1001;
		karthik.salary = 50000;
		System.out.println(karthik);
		System.out.println(karthik.name);
		Developers saiAvena =  karthik; // new Developers()
		System.out.println(saiAvena);
		saiAvena.name = "SaiAvena";
		System.out.println(karthik.name);
		
	}

}
