package com.codeu.event.rental;

import java.io.Serializable;

public class PlaneSeat extends Rentable implements Serializable {
	private static final long serialVersionUID = 1133021806110300272L;
	private String departureCode;
	private String arrivalCode;
	private String seatNumberAndRow;
	
	public PlaneSeat(String departureCode, String arrivalCode, String seatNumberAndRow) {
		
		this.setDepartureCode(departureCode.toUpperCase());
		this.setArrivalCode(arrivalCode.toUpperCase());
		this.setSeatNumberAndRow(seatNumberAndRow.toUpperCase());
		
	}
	
	@Override
	public String toString() {
		
		String mssg = this.getDepartureCode() + " to " + this.getArrivalCode() + " in seat " + this.getSeatNumberAndRow() + "." + "\n";
		return mssg;
		
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((arrivalCode == null) ? 0 : arrivalCode.hashCode());
//		result = prime * result + ((departureCode == null) ? 0 : departureCode.hashCode());
//		result = prime * result + seatNumberAndRow;
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof PlaneSeat) {
			
			PlaneSeat ps = (PlaneSeat) obj;
			return this.getSeatNumberAndRow() == ps.getSeatNumberAndRow();	
		
		}
		
		return false;
	}

	private String getDepartureCode() {
		return departureCode;
	}

	private String getArrivalCode() {
		return arrivalCode;
	}

	private String getSeatNumberAndRow() {
		return seatNumberAndRow;
	}

	private void setDepartureCode(String departureCode) {
		this.departureCode = departureCode;
	}

	private void setArrivalCode(String arrivalCode) {
		this.arrivalCode = arrivalCode;
	}

	private void setSeatNumberAndRow(String seatNumberAndRow) {
		this.seatNumberAndRow = seatNumberAndRow;
	}	

}
