
public class Methods {
	
	void wheresWaldo(String[]  arr) {
//		Iterate until less or equal to the length of the array.
		for (int i = 0; i < arr.length; i++) {
			
//			If the value of the current index, lowercased, equals "waldo", print a message and the index. Else print out a message.
			if(arr[i].toLowerCase().equals("waldo")) {
				
				System.out.println("Waldo is at index no. " + i + ".");
			
			} else {
				
				System.out.println("Not Waldo!");
			}
			
		}
	}
	
}
