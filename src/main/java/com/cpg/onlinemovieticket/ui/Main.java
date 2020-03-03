package com.cpg.onlinemovieticket.ui;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.cpg.onlinemovieticket.dao.Database;
import com.cpg.onlinemovieticket.model.BookingState;
import com.cpg.onlinemovieticket.model.Movie;
import com.cpg.onlinemovieticket.model.Screen;
import com.cpg.onlinemovieticket.model.Seat;
import com.cpg.onlinemovieticket.model.Show;
import com.cpg.onlinemovieticket.service.ScreenServiceImpl;

public class Main {
	
	Database data = new Database();	
	
	public static void main(String[] args) {
		Main service = new Main();
		ScreenServiceImpl obj = new ScreenServiceImpl();
		service.values(service.data);
		service.populateMap(service.data);
		obj.control(service.data);
		
	}
	
	
	private void populateMap(Database data) {

		for (Show show : data.allShowsList) {

			String key = show.getMovie().getMovieName();
			if (data.showsMap.containsKey(key)) {
				data.showsMap.get(key).add(show);

			} else {
				List<Show> shows = new ArrayList<>();
				shows.add(show);
				data.showsMap.put(key.toUpperCase(), shows);
			}
		}
	}
	

	public void values(Database data) {
		Movie movie1 = new Movie(123, "Jumanji 2", "Comedy/Action/Fantasy", "Joe Johnston",
				new String[] { "English", "Hindi" }, LocalDate.of(2019, 12, 13));
		Movie movie2 = new Movie(120, "Deadpool 2", "Comedy/Action/ComicBook", "David Leitch", new String[] { "English", "Hindi" },
				LocalDate.of(2019, 12, 15));
		Movie movie3 = new Movie(181, "Avengers:EndGame", "Action/Superhero/Adventure", "Anthony Russo/Joe Russo", new String[] { "English", "Hindi" },
				LocalDate.of(2020, 01, 01));
		Movie movie4 = new Movie(122, "Joker", "Drama/Thriller/Crime", "Todd Philips", new String[] { "English", "Hindi" },
				LocalDate.of(2020, 01, 12));

		Seat seat1 = new Seat(123456,BookingState.AVAILABLE, 180.0);
		Seat seat2 = new Seat(12345, BookingState.BOOKED, 150.0);
		Seat seat3 = new Seat(null, BookingState.BLOCKED, 150.0);
		Seat seat4 = new Seat(1,BookingState.AVAILABLE, 150.0);
		Seat seat5 = new Seat(2,BookingState.AVAILABLE, 150.0);
		Seat seat6 = new Seat(3,BookingState.BLOCKED, 150.0);
		Seat seat7 = new Seat(4,BookingState.AVAILABLE, 150.0);
		Seat seat8 = new Seat(5,BookingState.AVAILABLE, 150.0);
		Seat seat9 = new Seat(6,BookingState.AVAILABLE, 150.0);
		Seat seat10 = new Seat(7,BookingState.AVAILABLE, 180.0);

		List<Seat> seatList = new ArrayList<Seat>();
		seatList.add(seat1);
		seatList.add(seat2);
		seatList.add(seat3);
		seatList.add(seat4);
		seatList.add(seat5);
		seatList.add(seat6);
		seatList.add(seat7);
		seatList.add(seat8);
		seatList.add(seat9);
		seatList.add(seat10);

		try {
			Screen screen1 = new Screen(123, 10, 10, LocalDate.of(2020, 02, 03), "Audi 1");
			Screen screen2 = new Screen(123, 10, 10, LocalDate.of(2020, 10, 03), "Audi 2");
			Screen screen3 = new Screen(123, 10, 10, LocalDate.of(2020, 10, 03), "Audi 3");
			Screen screen4 = new Screen(123, 10, 10, LocalDate.of(2020, 10, 03), "Audi 4");

			Show show1 = new Show(2345, movie1, screen1,LocalTime.of(12, 00), LocalTime.of(14, 15),
					"12:00PM-02:15PM", seatList);
		
			Show show2 = new Show(2345, movie2, screen1, LocalTime.of(20, 00), LocalTime.of(23, 15),
					"08:00PM-10:15PM", seatList);
			Show show3 = new Show(2345, movie3, screen2, LocalTime.of(20, 20), LocalTime.of(23, 30),
					"08:20PM-11:30PM", seatList);
			Show show4 = new Show(2345, movie4, screen2, LocalTime.of(13,00), LocalTime.of(15, 15),
					"01:00PM-03:15PM", seatList);
			Show show5 = new Show(2345, movie3, screen3, LocalTime.of(15, 20), LocalTime.of(18, 30),
					"03:20PM-06:30PM", seatList);
			Show show6 = new Show(2345, movie4, screen3, LocalTime.of(20, 20), LocalTime.of(22, 30),
					"08:20PM-10:30PM", seatList);
			Show show7 = new Show(2345, movie3, screen4, LocalTime.of(10,00), LocalTime.of(13,15),
					"10:00AM-01:15PM", seatList);
			
			 List<Show> showListForScreen1 = new ArrayList<>();
			 showListForScreen1.add(show1);
			 showListForScreen1.add(show2);
			 
			 List<Show> showListForScreen2 = new ArrayList<>();
			 showListForScreen2.add(show3);
			 showListForScreen2.add(show4);
			 
			 List<Show> showListForScreen3 = new ArrayList<>();
			 showListForScreen2.add(show5);
			 showListForScreen3.add(show6);
			 
			 List<Show> showListForScreen4 = new ArrayList<>();
			 showListForScreen4.add(show7);
			
			 
			screen1.setShowList(showListForScreen1);
			screen2.setShowList(showListForScreen2);
			screen3.setShowList(showListForScreen3);
			screen4.setShowList(showListForScreen4);

			data.allShowsList.add(show1);
			data.allShowsList.add(show2);
			data.allShowsList.add(show3);
			data.allShowsList.add(show4);
			data.allShowsList.add(show5);
			data.allShowsList.add(show6);
			data.allShowsList.add(show7);

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}