
public class Program2 {
	
	static String reverse(String s) {
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			t += s.charAt(i);
		}
		return t;
	}

	public static void main(String[] args) {
		String str = "Jack and Jill";
		str = str.toLowerCase();
		String ar[] = str.split(" ");
		String result = "";
		for(int i=0;i<ar.length;i++) {
			result = result + reverse(ar[i]+" ");
		}
		System.out.println(result.trim());
		
	}

}
