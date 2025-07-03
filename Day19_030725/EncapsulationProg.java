
public class EncapsulationProg {
	
	static void findMaxOf2(int a, int b) {
		if (a>10) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
	}
	
	static int findMax3(int a,int b, int c) {
		int maxOfThree = (a>b)?(a>c)?(a):(c):(b>c)?b:c;
		return maxOfThree;
	}
	
	static void traverse(int ar[]) {
		for(int ele:ar) {
			System.out.println(ele);
		}
	}

	public static void main(String[] args) {
				//traversing
				int ar[] = {5,1,3,2,4};
				traverse(ar);
				int ar2[] = {20,5,3,2,36};
				traverse(ar);
				//find max of 2 numbers
				int a = 5;
				int b = 4;
				int c = 9;
				findMaxOf2(a, b);
				findMaxOf2(40,29);
				System.out.println(findMax3(a,b,c));

	}

}
