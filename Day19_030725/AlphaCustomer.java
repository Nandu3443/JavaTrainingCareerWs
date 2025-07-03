class Sbi{
	private String name;
	private long crnNumber;
	private double balance;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setCrNumber(long crnNumber) {
		this.crnNumber = crnNumber;
	}
	
	public void setBalance(double balance) {
		if  (balance >=2000) {
			this.balance = balance;
		}else {
			System.out.println("Not Accepted..");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public long getCrnNumber() {
		return crnNumber;
	}
	
	public double getBalance() {
		return balance;
	}
}
public class AlphaCustomer {

	public static void main(String[] args) {
			Sbi alex = new Sbi();
			alex.setName("Alex");
			alex.setCrNumber(123123312323l);
			alex.setBalance(2000);
			System.out.println(alex.getName());
			System.out.println(alex.getCrnNumber());
			System.out.println(alex.getBalance());
	}
}
