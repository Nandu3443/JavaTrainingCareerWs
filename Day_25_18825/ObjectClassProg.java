


class Engineer implements Cloneable{
	String name;
	int age;
	public String toString() {
//		return Integer.toHexString(hashCode());
		return "Engineer Class";
	}
	Engineer(String name,int age){
		this.name  = name;
		this.age = age;
	}
	Engineer(){
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class DataEngineer extends Engineer{
	DataEngineer(){
		super("",10);
	}
}

public class ObjectClassProg {

	public static void main(String[] args) throws CloneNotSupportedException {
		Engineer eng= new Engineer();
		Engineer eng2= new Engineer();
		System.out.println(eng.hashCode());
		System.out.println(eng2.hashCode());
		System.out.println(eng.equals(eng));
		System.out.println(eng.getClass());
		DataEngineer de= new DataEngineer();
		System.out.println(de.getClass());
		
		Engineer sai_avena= new Engineer("Sai Avena",29);
		Engineer sai_avena2 = (Engineer) sai_avena.clone();
		System.out.println(sai_avena.equals(sai_avena2));
		System.out.println(sai_avena2.name);
		
		System.out.println(eng.toString());
		int a = 10;
		System.out.println(a);
				
		
		
		}

}
