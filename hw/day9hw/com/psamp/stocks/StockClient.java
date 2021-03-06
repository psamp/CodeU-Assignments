package com.psamp.stocks;

class StockClient {
	
//	Start program.
	public static void main(String[] args) {
		
//		New array of Stock objects.
		Stock stocks[] = {
				new Stock("ABC", 20.01, 1.30),
				new Stock("DEF", 30.11, .99),
				new Stock("GHI", 41.23, 1.99),
				new Stock ("JKL", 10.31, 1.19),
				new Stock ("MNO", 23.55, 4.21)
		};
		
//		New array of StockPERatio objects.
		StockPERatio per[] = new StockPERatio[stocks.length];
		
//		Give every index in per the value of a StockPERatio object, and call its constructor and pass in the stockName and peRatio.
		for (int i = 0; i < per.length; i++) {	
			per[i] = new StockPERatio(stocks[i].stockName, stocks[i].peRatio);
		}
		
/*		
* 		For every index of per, grab the name and the peRatio and print it. To obtain two decimal places, 
* 		pass peRatio multiplied times one hundred into Math.floor() (finds the smallest int a decimal can go down to) 
* 		and divide the product by one hundred to get the correct number.
*/		
		for (int i = 0; i < per.length; i++) {
			
				System.out.println(per[i].name + " | " + Math.floor(per[i].peRatio * 100) / 100);
				
		}	
		
	}
}
