
public class PalindromeProg {

	public static void main(String[] args) {
		String s = "rotator";
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			t += s.charAt(i);
		}
		if(s.equals(t)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
