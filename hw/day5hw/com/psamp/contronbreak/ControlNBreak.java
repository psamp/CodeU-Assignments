package com.psamp.contronbreak;

//This program should exhibit break and continue.

class ControlNBreak {
	
//	Start program.
	
	public static void main(String[] args) {
		
//		Give this for-loop a label.
		countToTen: for (int i = 0; i < 11; i++) {
			
/*			In the case of i being 3, 6, or 9, inform the user that they're multiples of three and break out of the loop, which executes line 28.
*			If i is any other value, print a message, and then continue countToTen, restarting the for-loop and printing the message after the switch.
*/
			switch(i) {
				case 3:
				case 6:
				case 9:
					System.out.println("Multiple of three! / " + i);
					break;
				default:
					System.out.println("Dolor si amet. / " + i);
					continue countToTen;
			}
			
			System.out.println("Hey there! You jumped to me! / " + i);
			
		}
		

	}

}
