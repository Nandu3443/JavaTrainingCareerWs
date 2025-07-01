
public class ReverseStringProg {

	public static void main(String[] args) {
		String s = "Good Morning";
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
//			t = t + s.charAt(i);
			t += s.charAt(i);
		}
		System.out.println(t);
	}

}
