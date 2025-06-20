
public class TransposeMatrix {

	public static void main(String[] args) {
		int rows = 2;
		int columns = 3;
				
		int orgMatrix[][] = new int[rows][columns];
		int newMatrix[][] = new int[columns][rows];
		int counter = 20;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				orgMatrix[i][j] = counter;
				counter++;
			}
		}
		System.out.println("Original Matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(orgMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				newMatrix[j][i] = orgMatrix[i][j];
			}
		}
		
		System.out.println("Transposed Matrix");
//		System.out.println(newMatrix.length);
//		System.out.println(newMatrix[0].length);
		for(int i=0;i<newMatrix.length;i++) {
			for(int j=0;j<newMatrix[i].length;j++) {
				System.out.print(newMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
