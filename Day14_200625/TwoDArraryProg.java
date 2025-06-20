import java.util.Scanner;

public class TwoDArraryProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of classrooms");
		int classRooms = sc.nextInt();
		System.out.println("Enter no of sections");
		int students = sc.nextInt();
		int array[][]= new int[classRooms][students];
		for(int i=0;i<classRooms;i++) {
			for(int j=0;j<students;j++) {
				System.out.println("Enter no.of students for class "+i+" Section "+j);
				array[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<classRooms;i++) {
			for(int j=0;j<students;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
