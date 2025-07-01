
public class StringMethodsProg {

	public static void main(String[] args) {
		String s = "Good Morning";
		System.out.println(s.length());
		
		s = s.toLowerCase();
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = "Mississippi";
		System.out.println(s.contains("issi"));
		
		System.out.println(s.startsWith("miss"));
		
		System.out.println(s.endsWith("pi"));
		
		s = "Mssissippi";
		System.out.println(s.indexOf("i"));
		
		s = "  Good Morning  ";
		System.out.println(s.trim());
		
		
		String s1 = "abc";
		String s2 = "aac";
		System.out.println(s1.compareTo(s2));
		
		s1 = "ABC";
		s2 = "abc";
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s1 = "abc";
		System.out.println(s1.charAt(2));
		
		s1 = "Mississippi";
		System.out.println(s1.substring(4,8));
		
		
		s = "miss";
		
		char ar[] = s.toCharArray();
		
		System.out.println(ar);
		
		s1 = "India is my country";
		String words[] =  s1.split(" ");
		System.out.println(words[0]);
		
		s1 = "Mississippi";
		
		s1 = s1.replace("is", "");
		
		System.out.println(s1);
		
	}

}
