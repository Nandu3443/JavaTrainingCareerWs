
public class PatternsProg {

	public static void main(String[] args) {
		int n = 5;
		// used outer loop for rows
		for(int i=0;i<n;i++) {
			// used inner loop for columns
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1|i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1||i==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
