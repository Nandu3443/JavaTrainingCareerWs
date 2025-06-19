
public class ArraysProg {

	public static void main(String[] args) {
		int marks[] = new int[5];
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[4]);
//		System.out.println(marks[5]);
		marks[0] = 90;
		marks[1] = 65;
		marks[0] = 91;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks.length);
		System.out.println(Integer.MAX_VALUE);
	}

}
