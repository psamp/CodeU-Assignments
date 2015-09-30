//This program needs to take three integers, perform basic math operations on them, & output the results.

class EvalNumbers {
	
//	Take three unknown integers, add them together and return the sum. 
	public static int GetSum(int x, int y, int z) {
		int sum;
		sum = x + y + z;
		return sum;
	}
	
//	Take three unknown integers, add them together and divide them by how many of them there are.
	public static int GetAverage(int x, int y, int z, int v) {
		int avg;
		int num;
		num = x + y + z;
		avg = num / v;
		return avg;
	}
	
//	Take three integers, and multiply them by each other.
	public static int GetProduct(int x, int y, int z) {
		int prod;
		prod = x * y * z; 
		return prod;
	}
	
//	Take three integers, and evaluate which is the smallest. 
	public static int GetSmallest(int x, int y, int z) {
		int sml;
		int smallest;
		
		smallest = 0;
		
		if(x < y && x < z) {
			smallest = x;
			
		} else if(y < z && y < x) {
			smallest = y;
			
		} else if(z < x && z < y) {
			smallest = z;
		}
		
		sml = smallest;
		return sml;
	}
	
//	Take three integers, and evaluate which is the largest. 
	public static int GetLargest(int x, int y, int z) {
		int lrg;
		int largest;
		
		largest = 0;
		
		if(x > y && x > z) {
			largest = x;
			
		} else if(y > z && y > x) {
			largest = y;
			
		} else if(z > x && z > y) {
			largest = z;
		}
		
		lrg = largest;
		return lrg;
	}
	
//	Every Java program is instantiated with main(). You declare all variables before using them.
	public static void main(String [] args) {
		int add;
		int average;
		int product;
		int smallest;
		int largest;
		
//		Call the above methods and pass in params.
		add = GetSum(2, 4, 6);
		average = GetAverage(2, 4, 6, 3);
		product = GetProduct(2, 4, 6);
		smallest = GetSmallest(2, 4, 6);
		largest = GetLargest(2, 4, 6);
		
//		Print messages in the console.
		System.out.println("2, 4, and 6 have a sum of " + add + ".");
		System.out.println("2, 4, and 6 have an average of " + average + ".");
		System.out.println("2, 4, and 6 have a product of " + product + ".");
		System.out.println("The smallest of 2, 4, and 6 is " + smallest + ".");
		System.out.println("The largest of 2, 4, and 6 is " + largest + ".");
	}
}
