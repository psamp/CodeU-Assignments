
public class MethodsClient {

	public static void main(String[] args) {
		
//		Create array of names.
		String[] namesArray = {"Bucky", "Korra", "Waldo", "Ahsoka"};
		
//		Iterate until less or equal to the length of the array.
		for (int i = 0; i < namesArray.length; i++) {
			
//			If the value of the current index, lowercased equals "waldo", print a message and the index. Else print out a message.
			if(namesArray[i].toLowerCase().equals("waldo")) {
				
				System.out.println("Waldo is at index no. " + i + ".");
			
			} else {
				
				System.out.println("Not Waldo!");
			}
			
		}
		
	}

}
