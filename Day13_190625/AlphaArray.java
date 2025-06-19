import java.util.Scanner;

public class AlphaArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int intial_value = 1;
		for(int i=0;i<arr.length;i++) {
			arr[i] = intial_value + i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
//			sum = arr[i] + sum;
//			sum = sum + arr[i];
			sum +=arr[i];
		}
		System.out.println(sum);

	}

}
