package com.cpg.onlinemovieticket.service;

import com.cpg.onlinemovieticket.dao.Database;
import com.cpg.onlinemovieticket.dao.ScreenDaoImpl;
import com.cpg.onlinemovieticket.exception.MyException;
import com.cpg.onlinemovieticket.model.Show;

public class ScreenServiceImpl implements ScreenServiceInterface {

	ScreenDaoImpl sd = new ScreenDaoImpl();
	Database data = new Database();

	@Override
	public void showShows(Database data) {
		if (!data.allShowsList.isEmpty()) {
			for (Show show : data.allShowsList) {
				System.out.println(String.format(
						"Details-\n Theatre Id : %s\n Movie Name : %s\n Movie Id : %s\nShow Name : %s\n "
								+ "Show Id : %s\n Screen Name : %s\n  Screen Id : %s\n Movie Length(in min) : %s\n Movie Genre : %s\n"
								+ " Movie Director : %s\n No. of Seats : %s\n",
						show.getTheatreId(), show.getMovie().getMovieName(), show.getMovie().getMovieId(),
						show.getShowName(), show.getShowId(), show.getScreen().getScreenName(),
						show.getScreen().getScreenId(), show.getMovie().getMovieLength(),
						show.getMovie().getMovieGenre(), show.getMovie().getMovieDirector(), show.getSeats().size()));
			}
		} else {
			System.out.println("No Shows Available");
		}
	}

	@Override
	public void control(Database data) {
		do {
			System.out.println(" Do you want to:\n 1) see the show list for a movie?\n"
					+ " 2) see the show list for all the movies?" + "\n 3) exit?");
			String choice = InputSystem.getInput();
			
			switch (choice) {
			case "1":
				System.out.println("Enter one of following Movie:");
				System.out.println(data.showsMap.keySet());
				System.out.println("Enter the movie name");
				String moviename = InputSystem.getInput();
				if (data.showsMap.keySet().contains(moviename.toUpperCase())) {

					for (Show show : sd.searchShow(moviename, data)) {

						System.out.println(String.format(
								"Details-\n Show Name : %s\n Show Id : %s\n Screen Id : %s\n Screen Name : %s\n"
										+ " Movie Length(in min) : %s\n",
								show.getShowName(), show.getShowId(), show.getScreen().getScreenId(),
								show.getScreen().getScreenName(), show.getMovie().getMovieLength()));
					}
				} else {
					try {
						throw new MyException("Movie is not present.");
					} catch (MyException e) {
						System.out.println(e.getMessage());
						break;
					}
				}

				break;
			case "2":
				showShows(data);
				break;

			case "3":
				return;

			default:
				try {
					throw new MyException("Choice not defined.");
				} catch (MyException e) {
					System.out.println(e.getMessage());
				}

			}

		} while (true);
	}
}
