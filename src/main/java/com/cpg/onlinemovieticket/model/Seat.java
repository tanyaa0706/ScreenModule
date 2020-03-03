package com.cpg.onlinemovieticket.model;

public class Seat {
	
	private Integer seatId;
	
	private BookingState seatStatus;
	
	private Double seatPrice;
	
	public Seat(Integer seatId,BookingState seatStatus, Double seatPrice) {
		this.seatStatus = seatStatus;
		this.seatPrice = seatPrice;
		this.seatId = seatId;
	}
	

	public Integer getSeatId() {
		return seatId;
	}

	public BookingState getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(BookingState seatStatus) {
		this.seatStatus = seatStatus;
	}

	public Double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(Double seatPrice) {
		this.seatPrice = seatPrice;
	}

	@Override
	public String toString() {
		return "[seatId=" + seatId + ", seatStatus=" + seatStatus + ", seatPrice=" + seatPrice + "]";
	}
	
	
}


