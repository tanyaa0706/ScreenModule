package com.cpg.onlinemovieticket.model;

import java.time.LocalDate;
import java.util.Random;

public class Movie {

	private final Integer movieId;

	private final Integer movieLength;

	private final String movieName;

	private final String movieGenre;

	private final String movieDirector;

	private final String[] languages;

	private final LocalDate movieReleaseDate;

	public Movie(Integer movieLength, String movieName, String movieGenre, String movieDirector,
			String[] languages, LocalDate movieReleaseDate) {
		this.movieId = movieIdGenerator();
		this.movieLength = movieLength;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}

	public Integer movieIdGenerator() {
		return 300000 + new Random().nextInt(100000);
	}

	public Integer getMovieId() {
		return movieId;
	}

	public Integer getMovieLength() {
		return movieLength;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public String[] getLanguages() {
		return languages;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}
	
}
