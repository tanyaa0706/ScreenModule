package com.cpg.onlinemovieticket.dao;

import java.util.List;

import com.cpg.onlinemovieticket.model.Show;

public interface ScreenDaoInterface {
	
	public List<Show> searchShow(String movieName, Database data);

}