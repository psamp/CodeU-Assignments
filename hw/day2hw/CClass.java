
public class CClass {

	public static void main(String[] args) {
//		Create variables.
		byte b;
		int i = 257;
		double d = 323.142;
		
//		Convert int to byte, which means modulo reducing 32 by 8, the byte's width.
		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);
		
//		Convert double to int, which means modulo reducing 64 by 32.
		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		
//		Convert double to byte, which means modulo reducing 64 by 8.
		System.out.println("\nConversion of double to byte");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);

	}

}
