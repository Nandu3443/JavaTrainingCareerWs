
public class MatrixRotation90 {

	public static void main(String[] args) {
		 int arr[][] = new int[3][3];
		 int newMatrix[][] = new int[3][3];
		 int value = 1;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 arr[i][j] = value;
				 value++;
			 }
		 } 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 int row = arr[i].length;
			 for(int j=0;j<arr[i].length;j++) {
				  newMatrix[j][(row-1)-i] =arr[i][j];
			 }
		 }
		 System.out.println();
		 for(int i=0;i<newMatrix.length;i++) {
			 for(int j=0;j<newMatrix[i].length;j++) {
				 System.out.print(newMatrix[i][j]+" ");
			 }
			 System.out.println();
		 }

	}

}
