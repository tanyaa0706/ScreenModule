package com.cpg.onlinemovieticket.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Screen {

	private final Long screenId;

	private final Integer theatreId;

	private final Integer rows;

	private final Integer columns;

	private final LocalDate movieEndDate;

	private final String screenName;

	private List<Show> showList;

	@Override
	public String toString() {
		return "**** Screen ****"
				+ "[screenId=" + screenId + ", theatreId=" + theatreId + ", rows=" + rows + ", columns=" + columns
				+ ", movieEndDate=" + movieEndDate + ", screenName=" + screenName + ", showList=" + showList + "]";
	}

	public Screen(Integer theatreId, Integer rows, Integer columns, LocalDate movieEndDate,
			String screenName){
		this.theatreId = theatreId;
		this.rows = rows;
		this.columns = columns;
		this.movieEndDate = movieEndDate;
		this.screenName = screenName;
		this.screenId = screenIdGenerator();
	}

	public Long screenIdGenerator() {
		Integer random = new Random().nextInt(1000);
		return Long.parseLong(random.toString() + theatreId.toString());
	}

	public Long getScreenId() {
		return screenId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public String getScreenName() {
		return screenName;
	}

	public List<Show> getShowList() {
		return showList;
	}

	public void setShowList(List<Show> showList) {
		this.showList = showList;
	}
	

}

