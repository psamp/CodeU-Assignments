//This program needs to generate numbers one through thirty, and identify whether they're even or odd.

class EvenAndOdd {
	public static void main(String[] args) {
		int x;
		
//For loop to generate the numbers. 
		
		for(x = 0; x<31; x++){
			
//Numbers divisible by two are even, so if x (each of our numbers) is even, return it and say it's even. Else, say it's odd.
			
			if(( x % 2) == 0){
				System.out.println(x + " is even.");
			} else {
				System.out.println(x + " is odd.");
			}
		}
	}
}