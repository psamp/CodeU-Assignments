package com.psamp.stocks;

public class Stock {
	String stockName = "";
	double stockPrice = 0;
	double stockEarnings = 0;
	double peRatio = 0;
	
	Stock(String sn, double sp, double se) {
		this.stockName = sn;
		this.stockPrice = sp;
		this.stockEarnings = se;
		this.peRatio = this.stockPrice / this.stockEarnings;
	}
}
