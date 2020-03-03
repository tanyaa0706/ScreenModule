package com.cpg.onlinemovieticket.model;

import java.time.LocalTime;
import java.util.List;

public class Show {

	private final Long showId;

	private final Screen screen;

	private final Integer theatreId;

	private final LocalTime showStartTime;

	private final LocalTime showEndTime;

	private final String showName;

	private final Movie movie;

	private final List<Seat> seats;
	
	//Parameterized Constructor
	public Show(Integer theatreId, Movie movie, Screen screen, LocalTime showStartTime,
			LocalTime showEndTime, String showName, List<Seat> seats) throws Exception {
//		if (theatreId == null || theatreId == 0) {
//			throw new Exception("Cannot create show. TheatreId is null or 0");
//		}
		this.theatreId = theatreId;
//		if (movie == null || movie.getMovieId() == null || movie.getMovieId() == 0) {
//			throw new Exception("Cannot create show. MovieId is null or 0");
//		}
		this.movie = movie;
//		if (screen == null || screen.getScreenId() == null || screen.getScreenId() == 0) {
//			throw new Exception("Cannot create show. ScreenId is null or 0");
//		}
		this.screen = screen;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.seats = seats;
		this.showId = showIdGenerator();
	}

	public Long showIdGenerator() {
		return Long.parseLong(((int)( Math.random()*100) + theatreId.toString() + movie.getMovieId().toString() + screen.getScreenId().toString()));
	}

	public Long getShowId() {
		return showId;
	}

	public Screen getScreen() {
		return screen;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public LocalTime getShowStartTime() {
		return showStartTime;
	}

	public LocalTime getShowEndTime() {
		return showEndTime;
	}

	public String getShowName() {
		return showName;
	}

	public Movie getMovie() {
		return movie;
	}

	public List<Seat> getSeats() {
		return seats;
	}

}
