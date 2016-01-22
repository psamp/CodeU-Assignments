class CalcArea {
	
//	This method could deal with floating-point literals and integer literals, so set it to return a double.
	public static double CalcTri(double b, double h) {
		double area;
//		Multiply by .5 instead of dividing by two, since this a double (decimal.)
		area = b * .5 * h;
		return area;
	}	
//	Instantiate the main program. Call on our method for calculating triangle area with params passed in and print it. 
	public static void main(String[] args) {
		double triangle;
		triangle = CalcTri(3, 10);
		System.out.print("A triangle with a base of 3 and a height of 10 has an area of " + triangle);
		
	}

}
