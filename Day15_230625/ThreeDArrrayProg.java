
public class ThreeDArrrayProg {

	public static void main(String[] args) {
		int ar[][][]= new int[2][2][3];
		for(int i=0;i<ar.length;i++) {
//			System.out.println("i->"+i);
			for(int j=0;j<ar[i].length;j++) {
//				System.out.println("j->"+j);
				for(int k=0;k<ar[i][j].length;k++) {
					System.out.print(ar[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
