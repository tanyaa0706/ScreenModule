package com.cpg.onlinemovieticket.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.cpg.onlinemovieticket.model.Show;

public class ScreenDaoImpl implements ScreenDaoInterface {
	
	@Override
	public List<Show> searchShow(String movieName, Database data) {

		List<Show> listOfShows = new ArrayList<Show>();

		Set<String> set = data.showsMap.keySet();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) 
		{
			String key = iter.next();
			for (Show show : data.showsMap.get(key)) 
			{
				if (show.getMovie().getMovieName().equalsIgnoreCase(movieName)) 
				{
					listOfShows.add(show);
				}
			}
		}

		return listOfShows;
	}
}