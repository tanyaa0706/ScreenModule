package com.cpg.onlinemovieticket.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cpg.onlinemovieticket.model.Show;

public class Database {
	
	public HashMap<String, List<Show>> showsMap = new HashMap<>();
	
	public List<Show> allShowsList = new ArrayList<>();
	
}