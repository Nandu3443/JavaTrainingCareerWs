import java.util.Scanner;

class MyArray{
	int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int intial_value = 1;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value for index "+i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	void display(int x[]) {
		System.out.println("Displaying the elements in the array.");
		for (int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
}
public class ArrayProgram {

	public static void main(String[] args) {
		MyArray obj = new MyArray();
		int result[] = obj.input();
		obj.display(result);

	}

}
