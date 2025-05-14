
public class DataTypeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	implicit casting
		byte y = 10;
		int x = y;
		long l =x;
		
		int i = 130;
		byte b = (byte)i;
		System.out.println(b);
		
		long value = 2147483650l;
		int value_conversion = (int)value;
		System.out.println(value_conversion);
		
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
//		int _ = 10;
		
		float f = 15.3f;
		double d = 15.3;
		
	}

}
