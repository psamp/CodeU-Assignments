
public class CClass {

	public static void main(String[] args) {
//		Create variables.
		byte b;
		int i = 257;
		double d = 323.142;
		
//		Convert int to byte, which means 257 mod 8.
		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);
		
//		Convert double to int, which means everything after the decimal is lost.
		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		
//		Convert double to byte, which means 323 (the fraction is dropped) mod 256.
		System.out.println("\nConversion of double to byte");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);

	}

}
