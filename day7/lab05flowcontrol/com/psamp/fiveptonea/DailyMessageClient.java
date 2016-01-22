package com.psamp.fiveptonea;
import java.util.Scanner;

public class DailyMessageClient {

//	Start program.
	public static void main(String[] args) {
		
//		New instances of DailyMessage and Scanner.
		Scanner scn = new Scanner(System.in);
		DailyMessage dm = new DailyMessage();
		
//		Call getMessage method on our instance of dm, and pass in our scanner object, scn.
		dm.getMessage(scn);

	}

}
