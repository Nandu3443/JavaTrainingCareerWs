
public class ForEachTernaryProg {

	public static void main(String[] args) {
		
		//traversing
		int ar[] = {5,1,3,2,4};
		for(int ele:ar) {
			System.out.println(ele);
		}
		
		
		//find max of 2 numbers
		int a = 5;
		int b = 4;
		int c = 9;
		if (a>10) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		
		String result = a>b ?"a is greater than b":"b is greater than a";
		System.out.println(result);

		//find max of 3 numbers
		if (a>b) {
			if (a>c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
		int maxOfThree = (a>b)?(a>c)?(a):(c):(b>c)?b:c;
		System.out.println(maxOfThree);
		
		
		
		

	}

}
